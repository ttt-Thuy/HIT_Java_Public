package BAI3;

import BAI2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
    private ArrayList<Student> list ;
    public StudentManager() {

    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    @Override
    public void sortBySCoreDesc() {
        //sap giam
        Collections.sort(list, Comparator.comparingDouble(Student::getScore).reversed());
    }

    @Override
    public void sortByScoreAsc() {
        //sap tang
        Collections.sort(list, Comparator.comparingDouble(Student::getScore));

    }

    @Override
    public Student findByName(String name) {
        for(Student sv: list){
            if(sv.getName().equalsIgnoreCase(name)){
                return sv;
            }
        }
        return null;
    }

    @Override
    public void printStudents() {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %n", "ID", "|TEN", "|DIEM", "|TUOI", "|EMAIL", "|LOP", "|DIA CHI");
        for(Student sv: list){
            System.out.printf("%-10s %-10s %-10.2f %-10d %-10s %-10s %-10s %n", sv.getId(), sv.getName(), sv.getScore(), sv.getAge(), sv.getEmail(), sv.getClassName(), sv.getAddress() );
        }
    }
}

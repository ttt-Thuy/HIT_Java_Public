package BAI3;

import BAI2.Student;

public interface StudentManagerInterface {
    public void sortBySCoreDesc();
    public void sortByScoreAsc();
    public Student findByName(String name);
    public void printStudents();
}

package Tool;

import java.util.ArrayList;

public class Cage {
    private String cageCode;

    private ArrayList<Pet> pets = new ArrayList<>();

    private int currentPetCount;
    private static int totalCages =0;//tong so long
    private final int MAX_CAPACITY = 3;

    public Cage(String cageCode, ArrayList<Pet> pets, int currentPetCount) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = currentPetCount;
        totalCages++;
    }
    public Cage(){
        totalCages++;
    }

    public String getCageCode() {
        return cageCode;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void setCurrentPetCount(int currentPetCount) {
        this.currentPetCount = currentPetCount;
    }

    public static void setTotalCages(int totalCages) {
        Bai5_2.Cage.totalCages = totalCages;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void printAllPets(){
        for(Pet x: pets)
            System.out.println(x);
    }
}

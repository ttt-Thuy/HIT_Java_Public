import Tool.Cage;
import Tool.Pet;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pet dog1 = new Pet("A",54, "Dog");
        Pet dog2 = new Pet("B",54, "Dog");
        Pet dog3 = new Pet("C",54, "Dog");
        Pet dog4 = new Pet("E",54, "Dog");
        Pet dog5 = new Pet("F",54, "Dog");
        Pet dog6 = new Pet("G",54, "Dog");
        Pet dog7 = new Pet("H",54, "Dog");

        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Pet> petj = new ArrayList<>();
        Cage x=  new Cage("01", pets,0);
        Cage y=  new Cage("02", pets,0);

        x.addPet(dog1);
        x.addPet(dog2);
        x.addPet(dog3);
        x.addPet(dog4);
        x.addPet(dog5);
        x.addPet(dog6);
        x.addPet(dog7);
    }
}
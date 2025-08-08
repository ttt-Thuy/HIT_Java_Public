package Tool;

public class Pet {

    private String name;
    private double weight;
    private String species;

    public Pet(){}

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void printInfo(){
        System.out.println("ten: "+ this.name);
        System.out.println("loai: "+ this.species);
        System.out.println("can nang: "+ this.weight);
    }
    public boolean isOverweight(){
        if(this.weight>10)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}

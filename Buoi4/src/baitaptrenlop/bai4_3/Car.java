package baitaptrenlop.bai4_3;

public class Car {
    String brand;
    int maxSpeed;

    public Car(){

    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void run(){
        System.out.println("xe " + brand +" chay voi toc do toi da la: "+ maxSpeed +" km/h.");
    }
}

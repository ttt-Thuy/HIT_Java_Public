package bai1_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movable> movables = new ArrayList<>();
        movables.add(new Car());
        movables.add(new Bike());

        movables.getFirst().move();
        movables.get(1).move();
    }
}

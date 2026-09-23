package by.gsu.lecture05.task4;

import by.gsu.lecture05.task4.by.gsu.asoilab.Material;
import by.gsu.lecture05.task4.by.gsu.asoilab.Subject;

public class Runner {

    public static void main(String[] args) {
        Material steel = new Material("steel", 7850);
        Subject wire = new Subject("wire", steel, 0.03);

        System.out.println(wire);

        Material copper = new Material("copper", 8500);
        wire.setMaterial(copper);
        System.out.println("Mass with copper: " + wire.getMass());

        wire.setMaterial(steel);
        System.out.println(wire);
    }
}

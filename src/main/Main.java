package main;

import cts.Seminar1.Girafa;
import cts.Seminar1.IngrijitorZoo;
import cts.Seminar1.Zebra;
import cts.Seminar1.Zoo;

public class Main {
    public static void main(String[] args) {

        IngrijitorZoo ingr_zoo=new IngrijitorZoo("Ingrijitor1");
        Zoo z1= new Zoo("Zoo1", ingr_zoo);
        Zebra zebra1= new Zebra("zebra1");
        Zebra zebra2= new Zebra("zebra2");
        Girafa girafa1= new Girafa("girafa1");
        z1.addAnimal(zebra1);
        z1.addAnimal(zebra2);
        z1.addAnimal(girafa1);
        z1.hranesteAnimale("mancare");

    }
}

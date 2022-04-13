package Main;

import clase.Decorator;
import clase.DecoratorOcazie;
import clase.Printer;
import clase.PrinterBilet;

public class MainDecorator {
    public static void main(String[] args) {
        Printer printer=new PrinterBilet();
        Decorator decorator= new DecoratorOcazie( "La multi ani!", printer);
        printer.printeazaBilet();
        decorator.printeazaMesaj();
    }
}

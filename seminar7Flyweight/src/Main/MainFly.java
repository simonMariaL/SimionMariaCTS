package Main;

import clase.Autobuz;
import clase.AutobuzLinie;
import clase.Linie;
import clase.LinieFactory;

public class MainFly {
    public static void main(String[] args) {
        Autobuz a1= new Autobuz("Dacia", 2014, 50);
        Autobuz a2= new Autobuz("Mercedes", 2012, 20);
        Autobuz a3= new Autobuz("Renault", 2015, 30);
        Autobuz a4= new Autobuz("Dacia", 2016, 40);

        LinieFactory factory= new LinieFactory();
        Linie l1= factory.getLinie(168);
        Linie l2= factory.getLinie(137);
        l1.afiseazaDescriere(a1);
        l1.afiseazaDescriere(a4);
        l2.afiseazaDescriere(a2);
        l2.afiseazaDescriere(a3);
    }
}

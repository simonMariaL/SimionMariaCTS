package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecarePeTraseu;
import clase.Operator;

public class MainCommand {
    public static void main(String[] args) {
        Autobuz a1= new Autobuz("B34WWW");
        Autobuz a2= new Autobuz("VN23ZAY");

        Comanda com1= new ComandaPlecarePeTraseu(1, a1);
        Operator op1= new Operator();
        op1.addComanda(com1);
        op1.addComanda(new ComandaPlecarePeTraseu(76, a1));
        op1.addComanda(new ComandaPlecarePeTraseu(381, a2));
        op1.addComanda(new ComandaPlecarePeTraseu(313, a1));

        op1.executaComanda();
        op1.executaComanda();
        op1.executaComanda();
        op1.executaComanda();
        op1.executaComanda();
    }
}

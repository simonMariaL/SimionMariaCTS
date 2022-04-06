package Main;

import clase.Autobuz;
import clase.Grup;
import clase.NodAbstract;
import jdk.jshell.spi.ExecutionControl;

public class MainComposite {
    public static void main(String[] args) {
        NodAbstract a1 = new Autobuz("Dacia", 7, "aaa");
        NodAbstract a2 = new Autobuz("Dacia", 12, "aaa");
        NodAbstract a3 = new Autobuz("Dacia", 45, "aaa");
        NodAbstract grupMici = new Grup("autobuze Mici");
        NodAbstract grupMari = new Grup("autobuze Mari");
        NodAbstract flota = new Grup("Flota");

        {
            try {
                grupMici.addNod(a1);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            try {
                grupMici.addNod(a2);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            try {
                grupMari.addNod(a3);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            try {
                flota.addNod(grupMici);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            try {
                flota.addNod(grupMari);
            } catch (ExecutionControl.NotImplementedException ex) {
                ex.printStackTrace();
            }
            flota.afiseazaDescriere();

        }
    }


}

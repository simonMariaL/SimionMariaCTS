package Main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;
import clase.MijlocTransport;

public class MainProxy {

    public static void main(String[] args) {
        MijlocTransport autobuzNormal= new Autobuz(0, "Nume1");
        autobuzNormal.opresteInStatie();
        ((Autobuz)autobuzNormal).setNrCalatori(2);


        MijlocTransport autobuzDeNoapte= new AutobuzDeNoapte(autobuzNormal);

        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();

    }
}

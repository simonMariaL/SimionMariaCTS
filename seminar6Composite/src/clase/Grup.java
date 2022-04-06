package clase;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Grup implements NodAbstract{
    private List<NodAbstract> lista= new ArrayList<>();
    private String denumire;
    public Grup(String denumire){
        super();
        lista=new ArrayList<>();
        this.denumire=denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Denumirea grupului: " + this.denumire);
        for (NodAbstract i : lista) {
            i.afiseazaDescriere();
        }

    }
    @Override
    public NodAbstract getNodAbstract(int poz) throws ExecutionControl.NotImplementedException {
        return lista.get(poz);
    }


    @Override
    public void addNod(NodAbstract nodNou) throws ExecutionControl.NotImplementedException {
        lista.add(nodNou);
    }

    @Override
    public void removeNod(NodAbstract nod) throws ExecutionControl.NotImplementedException {
        lista.remove(nod);
    }
}

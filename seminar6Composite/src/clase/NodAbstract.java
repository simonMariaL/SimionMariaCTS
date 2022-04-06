package clase;

import jdk.jshell.spi.ExecutionControl;

public interface NodAbstract {
    void afiseazaDescriere();
    NodAbstract getNodAbstract(int poz) throws ExecutionControl.NotImplementedException;
    void addNod(NodAbstract nodNou) throws ExecutionControl.NotImplementedException;
    void removeNod(NodAbstract nod) throws ExecutionControl.NotImplementedException;
}

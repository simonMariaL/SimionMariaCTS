package clase;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements NodAbstract{

    private String producator;
    private Integer nrLocuri;
    private String model;

    public Autobuz(String producator, Integer nrLocuri, String model) {
        this.producator = producator;
        this.nrLocuri = nrLocuri;
        this.model = model;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public Integer getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDescriere() {
        this.toString();
    }

    @Override
    public NodAbstract getNodAbstract(int poz) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(null);
    }

    @Override
    public void addNod(NodAbstract nodNou) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(null);

    }

    @Override
    public void removeNod(NodAbstract nod) throws ExecutionControl.NotImplementedException {
        throw  new ExecutionControl.NotImplementedException(null);

    }

}

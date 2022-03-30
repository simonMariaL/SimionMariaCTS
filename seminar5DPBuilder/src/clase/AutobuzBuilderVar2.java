package clase;

public class AutobuzBuilderVar2 implements Builder{

    private String model;
    private String numeSofer;
    private  String nrInmatriculare;
    private  Boolean stop;
    private  Boolean openDoors;
    private  String text;
    private  Integer nrLinie;
    private  Boolean isNew;

    public AutobuzBuilderVar2(){
        model="Mercedes";
        numeSofer="Dorel";
        nrInmatriculare="B555STB";
        stop=true;
        openDoors=true;
        text="Buna ziua!";
        nrLinie=555;
        isNew=true;
    }
    @Override
    public Autobuz build() {
        return new Autobuz(model, numeSofer, nrInmatriculare, stop, openDoors, text, nrLinie, isNew);
    }

    public AutobuzBuilderVar2 setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilderVar2  setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilderVar2  setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilderVar2  setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }

    public AutobuzBuilderVar2  setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
        return this;
    }

    public AutobuzBuilderVar2  setText(String text) {
        this.text = text;
        return this;
    }

    public AutobuzBuilderVar2  setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
        return this;

    }

    public AutobuzBuilderVar2  setNew(Boolean aNew) {
        isNew = aNew;
        return this;
    }
}

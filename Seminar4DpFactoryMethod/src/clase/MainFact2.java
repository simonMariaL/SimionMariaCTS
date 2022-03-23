package clase;

public class MainFact2 {
    public static void modulAfisareMijlocTransport(Factory fabrica, String nrInmatriculare){
        MijlocTransportComun mijloc= fabrica.creareMijloc(nrInmatriculare);
        System.out.println(mijloc.toString());
    }
    public static void main(String[] args) {
        //Factory factory=new FactoryAutobuz();
        //System.out.println(factory.creareMijloc("Ceva").getNrInmatriculare());
        modulAfisareMijlocTransport(new FactoryAutobuz(), "nautobuz");

    }
}

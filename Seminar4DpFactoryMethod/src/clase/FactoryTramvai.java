package clase;

public class FactoryTramvai implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String numarInmatriculare) {
        return new Tramvai(numarInmatriculare);
    }
}

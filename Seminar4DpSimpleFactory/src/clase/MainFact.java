package clase;

public class MainFact {
    public static void main(String[] args) {
       MijlocTransportComun mijloc1= Factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "B22ALA");
       MijlocTransportComun mijloc2= Factory.creareMijlocTransport(TipMijlocTransport.Troleibuz, "B74BAL");
       MijlocTransportComun mijloc3=Factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "B44TRM");
        System.out.println(mijloc1);
        System.out.println(mijloc2);
        System.out.println(mijloc3);
    }
}

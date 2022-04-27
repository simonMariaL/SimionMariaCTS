package clase;

public class Tramvai extends MijlocTransportHandler{
    public Tramvai(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<pragDist){
            System.out.println("Mergi cu tramvaiul!");
        }
        else{
            getHandler().deplaseazaRequest(dist);
        }
    }
}

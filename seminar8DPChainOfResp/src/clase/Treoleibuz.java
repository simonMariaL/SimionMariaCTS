package clase;

public class Treoleibuz extends MijlocTransportHandler{

    public Treoleibuz(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<pragDist){
            System.out.println("Mergi cu troleibuzul!");
        }
        else{
            getHandler().deplaseazaRequest(dist);
        }
    }
}

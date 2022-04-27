package clase;

public class Autobuz extends MijlocTransportHandler{
    public Autobuz(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<pragDist){
            System.out.println("Mergi cu autobuzul!");
        }
        else{
            getHandler().deplaseazaRequest(dist);
        }
    }
}

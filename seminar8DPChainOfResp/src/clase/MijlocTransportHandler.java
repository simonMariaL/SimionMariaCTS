package clase;

public abstract class MijlocTransportHandler {
    private MijlocTransportHandler handler;
    protected  int pragDist;

    public void setHandler(MijlocTransportHandler handler){
        this.handler=handler;
    }

    public MijlocTransportHandler getHandler() {
        return handler;
    }

    public MijlocTransportHandler(int pragDist){
        this.pragDist=pragDist;
    }
    public abstract void deplaseazaRequest(int dist);

}

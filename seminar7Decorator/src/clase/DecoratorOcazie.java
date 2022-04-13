package clase;

public class DecoratorOcazie extends Decorator{
    private String mesaj;

    public DecoratorOcazie(String mesaj,Printer printer  ) {
        super(printer);
        this.mesaj=mesaj;

    }

    @Override
    public void printeazaMesaj() {
        System.out.println(mesaj);
    }
}

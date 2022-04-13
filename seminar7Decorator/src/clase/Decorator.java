package clase;

public abstract class Decorator implements Printer{
    Printer printer;

    public Decorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printeazaBilet() {
        printer.printeazaBilet();
    }
    public abstract void printeazaMesaj();
}

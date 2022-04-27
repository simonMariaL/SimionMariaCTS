package clase;

public class TramvaiProbe extends  TramvaiAbstract{
    @Override
    public void opresteStatie1() {
        System.out.println("Tramvaiul pleaca din statia 1");
    }

    @Override
    public void opresteStatie2() {
        System.out.println("Tramvaiul nu opreste in statie");

    }

    @Override
    public void opresteStatie3() {
        System.out.println("Tramvaiul pleaca din statia 3");

    }
}

package clase;

public class CardCalatorie implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Am platit suma de "+suma+" prin cardul de calatorii");
    }
}

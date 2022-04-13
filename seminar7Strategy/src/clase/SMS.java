package clase;

public class SMS implements ModPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("Am platit suma de "+suma+" prin sms");
    }
}

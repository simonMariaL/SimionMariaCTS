package clase.Main;

import clase.Adaptor.Adapter;
import clase.ValidatoareTerestre.ValidatorAutobuz;
import clase.ValidatoareTerestre.ValidatorTerestru;

public class MainAdaptor {
    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz=new ValidatorAutobuz();
        validatorAutobuz.valideazaBilet();
        validatorAutobuz.valideazaAbonament();

        ValidatorTerestru validatorMetrou= new Adapter();
        validatorMetrou.valideazaAbonament();
        validatorMetrou.valideazaBilet();
    }
}

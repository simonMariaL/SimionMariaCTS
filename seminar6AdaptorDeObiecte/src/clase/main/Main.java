package clase.main;

import clase.Adaptor.Adapter;
import clase.ValidatoareSubterane.ValidatorMetrou;
import clase.ValidatoareSubterane.ValidatorSubteran;
import clase.ValidatoareTerestre.ValidatorAutobuz;
import clase.ValidatoareTerestre.ValidatorTerestru;

public class Main {

    public static void valideazaBilet(ValidatorTerestru validatorT){
        validatorT.valideazaBilet();
    }
    public static void main(String[] args) {
        ValidatorSubteran validatorMetrou=new ValidatorMetrou();
        ValidatorTerestru validatorAutobuz= new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);
       Adapter adapter= new Adapter(validatorMetrou);
       valideazaBilet(adapter);
        // valideazaBilet(validatorMetrou);

    }
}

package clase.Adaptor;

import clase.ValidatoareSubterane.ValidatorMetrou;
import clase.ValidatoareSubterane.ValidatorSubteran;
import clase.ValidatoareTerestre.ValidatorTerestru;

public class Adapter implements ValidatorTerestru {

    ValidatorSubteran validatorMetrou;

    public Adapter(ValidatorSubteran validatorMetrou) {
        super();
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}

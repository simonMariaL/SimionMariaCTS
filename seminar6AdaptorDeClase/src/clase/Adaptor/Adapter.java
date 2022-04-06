package clase.Adaptor;

import clase.ValidatoareSubterane.ValidatorMetrou;
import clase.ValidatoareTerestre.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {
    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
}

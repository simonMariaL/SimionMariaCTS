package Main;

import clase.CardBancar;
import clase.CardCalatorie;
import clase.SMS;
import clase.Validator;

public class MainStrategy {
    public static void main(String[] args) {
        Validator validator= new Validator(3, new CardCalatorie());
        validator.platesteCalatorie();
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new SMS());
        validator.platesteCalatorie();
    }
}

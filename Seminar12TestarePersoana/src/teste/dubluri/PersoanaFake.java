package teste.dubluri;

import clase.persoana.IPersoana;

public class PersoanaFake implements IPersoana {
    String sex;
    Integer varsta;
    Boolean cnp;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public void setCnp(Boolean cnp) {
        this.cnp = cnp;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return cnp;
    }
}

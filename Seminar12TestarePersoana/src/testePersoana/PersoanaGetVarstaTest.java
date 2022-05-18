package testePersoana;

import clase.Persoana;
import exceptii.ExceptieCnpGresit;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaGetVarstaTest {

    //test right
    @Test
    public void getVarsta() {
        Persoana pers= new Persoana("Ana", "6010102223242");
        assertEquals(21, pers.getVarsta());
    }

    @Test
    public void boundaryGetVarstaTest() {
        Persoana pers= new Persoana("Ana", "3000101223244");
        assertEquals(222, pers.getVarsta());
    }

    @Test
    public void boundary2GetVarstaTest() {
        Persoana pers2= new Persoana("Ana","6220101223244");
        assertEquals(0, pers2.getVarsta());

    }

    @Test (expected = ExceptieCnpGresit.class)
    public void errorTestGetVarsta() {
        Persoana pers2= new Persoana("Ana","6250101223244");
        pers2.getVarsta();
    }

    @Test (expected = NumberFormatException.class)
    public void error2TesteGetVarsta() {
        Persoana pers2= new Persoana("Ana","sdfwefwef");
        pers2.getVarsta();

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void error3TestGetVarsta() {
        Persoana pers2= new Persoana("Ana","622");
        pers2.getVarsta();
    }

    @Test(timeout = 100)
    public void performanceGetVarstaTest() {
        Persoana pers2= new Persoana("Ana","6200101223244");
        pers2.getVarsta();
    }

    @Test
    public void orderTestGetVarsta() {
        Persoana pers2= new Persoana("Ion","1980101223244");
        Persoana pers3= new Persoana("Andrei","5000101223244");

        assertTrue(pers2.getVarsta()>pers3.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void existanceTestGetVarsta() {
        Persoana pers2= new Persoana("Ion",null);
        pers2.getVarsta();
    }

}
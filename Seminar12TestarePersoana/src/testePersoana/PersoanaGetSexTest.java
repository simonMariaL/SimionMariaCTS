package testePersoana;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaGetSexTest {

    //test corectitudine
    @org.junit.Test
    public void getSex(){
        Persoana persoana= new Persoana("Stanescu ", "1234567891111");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void bounderyGetSex(){
        Persoana pers= new Persoana("Stanescu", "3914194122222");
        Persoana pers2= new Persoana("Popescu", "6211256981542");

        assertEquals("M", pers.getSex());
        assertEquals("F", pers2.getSex());
    }

    @Test
    public void crossCheckGetSex() {
        Persoana pers= new Persoana("Stanescu", "2914194122222");
        assertEquals( pers.CNP.charAt(0)%2==1 ? "M":"F", pers.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorCheckGetSex() {
        Persoana pers= new Persoana("Stanescu", "0914194122222");
        pers.getSex();
    }

    @Test(timeout = 100)
    public void performanceTestGetSex() {
        Persoana pers= new Persoana("Stanescu", "1914194122222");
        pers.getSex();
    }

    @Test
    public void formatCheckGetSex() {
        Persoana pers= new Persoana("Stanescu", "1914194122222");
        Persoana pers2= new Persoana("Popescu", "6211256981542");

        assertEquals("M", pers.getSex());
        assertEquals("F", pers2.getSex());
    }

    @Test
    public void checkRangeGetSex() {
        Persoana pers= new Persoana("Popescu", "7211256981542");
        assertEquals("N/A", pers.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void existanceCheckGetSex() {
        Persoana pers= new Persoana("Popescu", null);
        pers.getSex();
    }

}
package teste.testari;
import clase.persoana.IPersoana;
import clase.claseAgentie.IPachetTuristic;
import clase.claseAgentie.PachetTuristic;
import  org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.categorii.ITesteCuFake;
import teste.categorii.ITesteCuStub;
import teste.categorii.ITesteDeRight;
import teste.dubluri.PersoanaFake;
import teste.dubluri.PersoanaStub;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PachetTuristicTest {

    @Test
    @Category(ITesteCuStub.class)
    public void testPoateRezerva(){
    IPersoana persoana= new PersoanaStub();
    IPachetTuristic pachetTuristic= new PachetTuristic(persoana, "Moscova", 2000.5);
    assertTrue(pachetTuristic.poateRezerva());
}

@Test
@Category({ITesteCuFake.class, ITesteDeRight.class})
    public void testNuPoateRezerva(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setVarsta(17);
        IPachetTuristic pachetTuristic= new PachetTuristic(persoanaFake, "Moscova", 1800.5);
        assertFalse(pachetTuristic.poateRezerva());
}

}

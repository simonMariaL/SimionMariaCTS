package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.testari.AgentieTurismTest;
import teste.categorii.ITesteCuFake;
import teste.testari.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(ITesteCuFake.class)

public class SuitaTesteCuFake {
}

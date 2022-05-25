package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.testari.AgentieTurismTest;
import teste.categorii.ITesteCuFake;
import teste.categorii.ITesteCuStub;
import teste.categorii.ITesteDeRight;
import teste.testari.PachetTuristicTest;

@RunWith(Categories.class)//!!F important. daca punem Suite.class nu mai tine cont de include si exclude si ruleaza toate testele
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.ExcludeCategory(ITesteDeRight.class)
@Categories.IncludeCategory({ITesteCuFake.class, ITesteCuStub.class})
public class SuitaDaFakeNuRight {
}

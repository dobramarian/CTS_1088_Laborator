package ro.ase.csie.cts.testare.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.testare.teste.categorii.TestImportant;

@RunWith(Categories.class)
@IncludeCategory({TestImportant.class})
@SuiteClasses({StudentTest.class, StudentTestAlteTeste.class })
public class AllTestsImportante {

}

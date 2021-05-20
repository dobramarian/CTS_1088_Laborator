package ro.ase.csie.cts.testare.teste;

import org.junit.Test;
import ro.ase.csie.cts.testare.modele.OperatiiMatematice;

import static org.junit.Assert.*;

public class TestOperatiiMatematice {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void test(){
        fail("Not yet implemented");
    }

    @Test
    public void testSumaValoriNormale() {
        int a = 5;
        int b = 6;
        int sumaAsteptata = 12;
        int sumaCalculata = OperatiiMatematice.suma(a, b);
        assertEquals("Test cu 5 si 6", sumaAsteptata, sumaCalculata);
    }
}
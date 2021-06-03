package ro.ase.csie.cts.testare.teste;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ro.ase.csie.cts.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.testare.exceptii.ExceptieNume;
import ro.ase.csie.cts.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.testare.modele.Student;
import ro.ase.csie.cts.testare.teste.categorii.TestImportant;
import ro.ase.csie.cts.testare.teste.categorii.TestPerformanta;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    static Student student;
    static ArrayList<Integer> note;
    static String numeInitial = "Gigel";
    static int varstaInitiala = 21;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{

        note = new ArrayList<>();
        note.add(9);
        note.add(7);
        note.add(10);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{

    }

    @Before
    void setUp() {
        student = new Student(numeInitial,varstaInitiala,note);
    }

    @After
    void tearDown() {
        student = null;
    }

    @Test
    public void test(){
        fail("Not yet implemented");
    }

    @Test
    public void testSetVarstaConformanceRight() throws ExceptieVarsta {
        int varstaNoua = 23;
        student.setVarsta(varstaNoua);
        assertEquals(varstaNoua,student.getVarsta(),"Test cu valori corecte");
    }

    @Test
    public void testSetNumeRight() {
        String numeNou = "Ana";
        try {
            student.setNume(numeNou);
            assertEquals(numeNou,student.getNume(),"Test cu valori corecte");
        } catch (ExceptieNume exceptieNume) {
            fail("Genereaza exceptie pentru valori corecte");
        }
    }

    @Test
    public void testSetVarstaErrorCondition() {
        int varstaNoua = Student.MIN_VARSTA - 1;
        try {
            student.setVarsta(varstaNoua);
            fail("NU genereaza exceptie pentru varsta in afara limitelor");
        } catch (ExceptieVarsta e) {
            assertTrue(true);
        }
    }

    @Test(expected = ExceptieNume.class)
    public void testSetNumeErrorCondition() throws ExceptieNume {
        String numeNou = "Io";
        student.setNume(numeNou);
    }

    @Category({TestPerformanta.class, TestImportant.class})
    @Test
    public void testGetNotaMinimaOrderingSetSortatCrescator() throws ExceptieNota {
        int notaMinima = 4;
        ArrayList<Integer> note = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            note.add(i+notaMinima);
        }
        student.setNote(note);

        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals(notaMinima,notaMinimaCalculata,"Test cu valori sortate crescator");
    }

    @Category(TestImportant.class)
    @Test
    public void testGetNotaMinimaCardinalitatyZero() throws ExceptieNota {
        ArrayList<Integer> note = new ArrayList<>();
        student.setNote(note);
        int notaMinima = 0;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals(notaMinima,notaMinimaCalculata,"Test fara note");
    }

    @Test
    public void testGetNotaMinimaCardinalityUnu() throws ExceptieNota {
        ArrayList<Integer> note = new ArrayList<>();
        note.add(Student.MAX_NOTA);
        student.setNote(note);

        int notaMinima = student.MAX_NOTA;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals(notaMinima,notaMinimaCalculata,"Test fara note");
    }

    @Test
    public void testGetNotaMinimaExistenceReferintaNoteNull() throws ExceptieNota{
        student.setNote(null);
        int notaMinima = 0;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals(notaMinima, notaMinimaCalculata,"Test cu referinta null pentru note");
    }
}

package ro.ase.csie.cts.testare.modele;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.csie.cts.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.testare.exceptii.ExceptieVarsta;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTestAlteTeste {

    //test fixture
    static Student student;
    static ArrayList<Integer> noteInitiale = new ArrayList<>();
    static String numeInitial;
    static int varstaInitiala;
    static int nrNoteInitiale;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        numeInitial = "Gigel";
        varstaInitiala = Student.MIN_VARSTA+1;
        nrNoteInitiale = 3;
        for(int i = 0; i < nrNoteInitiale; i++){
            noteInitiale.add(Student.MAX_NOTA-i);
        }
    }

    @Before
    public void setUp() throws Exception {
        student = new Student(numeInitial,varstaInitiala,noteInitiale);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected =  ExceptieVarsta.class)
    public void testSetVarstaRangeMinValue() throws ExceptieVarsta {
        int varstaNoua = Integer.MIN_VALUE;
        student.setVarsta(varstaNoua);

    }

    @Test(expected =  ExceptieVarsta.class)
    public void testSetVarstaRangeValoarePozitivaMare() throws ExceptieVarsta {
        int varstaNoua = 200;
        student.setVarsta(varstaNoua);

    }

    @Test
    public void testSetVarstaBoundaryLimitaInferioara() throws ExceptieVarsta {
        int varstaNoua = Student.MIN_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaStudent = student.getVarsta();
        assertEquals("Test pentru varsta minima",varstaNoua,varstaStudent);
    }

    @Test
    public void testSetVarstaBoundaryLimitaSuperioara() throws ExceptieVarsta {
        int varstaNoua = Student.MAX_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaStudent = student.getVarsta();
        assertEquals("Test pentru varsta maxima",varstaNoua,varstaStudent);
    }

    @Test
    public void testSetNoteReferenceShallowCopy() throws ExceptieVarsta, ExceptieNota {
        int noteStudent[] = new int[]{9,9,10};
        ArrayList<Integer> referintaNote = new ArrayList<>(Arrays.asList(9, 9, 10));

        student.setNote(referintaNote);
        referintaNote.set(0,5);

        int noteExistente[] = new int[student.getNrNote()];
        for(int i = 0; i < student.getNrNote(); i++){
            noteExistente[i] = student.getNota(i);
        }
        assertArrayEquals("Test shallow copy pe setNote",noteStudent,noteExistente);
    }


}
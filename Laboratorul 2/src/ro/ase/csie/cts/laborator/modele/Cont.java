package ro.ase.csie.cts.laborator.modele;

import ro.ase.csie.cts.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.laborator.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	public abstract double getBalanta();
	public abstract void alimenteazaContul(Double valoare);
	public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;
	public abstract void transfer(Cont destinatie, Double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
}

package ro.ase.csie.cts.laborator3.faza2;

import ro.ase.csie.cts.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.laborator3.exceptii.ExceptieVechimeClient;

public class Produs {

	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	public static void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
		}
	}
	
	public static void validareVechimeClient(int vechimeClient) throws ExceptieVechimeClient {
		if(vechimeClient <= 0) {
			throw new ExceptieVechimeClient();
		}
	}
	public static float getDiscountFidelitate(int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100; 
	}
	
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial- (discount * pretInitial);
	}
	

	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClient
	  {
		validarePret(pretInitial);
		validareVechimeClient(vechimeClientInAni);
		
	    float discountFidelitate = (tipProdus == TipProdus.NOU)? 0 : getDiscountFidelitate(vechimeClientInAni);
	    
    	float discount = TipProdus.NOU.getDiscount();
    	float valoareDiscountTipProdus = getPretCuDiscount(pretInitial,discount);
	    float pretFinal = valoareDiscountTipProdus *(1-discountFidelitate);
	    
		return pretFinal;
	  }

}
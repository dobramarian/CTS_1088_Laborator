package ro.ase.cts.csie.laborator3.faza1;

public class Produs {
	
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni)
	  {
	    float pretFinal = 0;
	    float discountFidelitate = (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100; 
	    if (tipProdus == TipProdus.NOU)
	    {
	      pretFinal = pretInitial;
	    }
	    else if (tipProdus == TipProdus.DISCOUNT)
	    {
	      pretFinal = (pretInitial - (TipProdus.DISCOUNT.getDiscount() * pretInitial)) - discountFidelitate * (pretInitial - (TipProdus.DISCOUNT.getDiscount() * pretInitial));
	    }
	    else if (tipProdus == TipProdus.STOC_LIMITAT)
	    {
	      pretFinal = (pretInitial - (TipProdus.STOC_LIMITAT.getDiscount() * pretInitial)) - discountFidelitate * (pretInitial - (TipProdus.STOC_LIMITAT.getDiscount() * pretInitial));
	    }
	    else if (tipProdus == TipProdus.VECHI)
	    {
	      pretFinal = (pretInitial - (TipProdus.VECHI.getDiscount() * pretInitial)) - discountFidelitate * (pretInitial - (TipProdus.VECHI.getDiscount() * pretInitial));
	    }
	    return pretFinal;
	  }
}
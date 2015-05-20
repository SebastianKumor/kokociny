
package javaModel;
/** Trieda obsahujuca metody na uchovavanie hodnoty casu a jej pripadne upravy 
 * @author Matus Mucha*/
public class CasPrac {// obsahuje cas potrebny na zostrojenie projektu
	
	/** protected premenna typu int reprezentujuca cas potrebny pre jednu suciastku */
	protected static int cas;
 
	/**
	 * Cas na naistalovanie komponentov
	 * @param casik vytvaranie objektu
	 */
	public CasPrac(int casik)
	{
		CasPrac.cas=casik;
	}
	
	/**
	 * getter pre cas. Metoda obsahuje aktualny cas potrebny na dokoncenie projektu
	 * @return cas udrzuje cas
	 */
	public int getCas() { 
		return cas;
		
	}

	/**
	 * setter pre cas. Metoda nastavuje cas
	 * @param Cas nastavuje cas
	 */
	public void setCas(int Cas) {
		CasPrac.cas = Cas;
		
	}

	
}


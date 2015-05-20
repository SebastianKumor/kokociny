package javaModel;

/** Trieda pomocou metod prepocitava Cenu a Cas
 * @author Matus Mucha*/

public class ZleSuciastky extends Suciastky { // 
	
	/**  Prepocitava Cenu za suciastky prvej triedy podla vzorca (Pocet Suciastok * 350) (v eurach)*/
	@Override
	public int setCena(int Pocet) // Vypocet Ceny pre zle suciastky v eurach
	{
		Pocet = Suciastky.getPocet();
		Cena = (Pocet * 350);
		return Cena;
	}
	
	/** Prepocitava cas potrebny na instalaciu suciastok podla vzorca (Pocet Suciastok * 4) (v hodinach) */
	public int setCas(int Pocet) // Vypocet Casu pre zle suciastky v hodinach
	{
		Pocet = Suciastky.getPocet();
		CasPrac.cas=(Pocet*4);
		return CasPrac.cas;
	}
}
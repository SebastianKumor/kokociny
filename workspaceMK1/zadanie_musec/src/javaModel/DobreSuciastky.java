package javaModel;
/** Trieda pomocou metod prepocitava cenu a cas 
 * @author Matus Mucha*/
public class DobreSuciastky extends Suciastky {
	
	/**  Prepocitava Cenu za suciastky prvej triedy podla vzorca (Pocet Suciastok*500) (v eurach)*/
	@Override
	public int setCena(int Pocet) // Vypocet ceny pre dobre suciastky v eurach
	{
		Pocet = Suciastky.getPocet();
		Cena = (Pocet * 500);
		return Cena;
	}
	/** Prepocitava cas potrebny na instalaciu suciastok podla vzorca (Pocet Suciastok * 2) (v hodinach) */
	public int setCas(int Pocet) // vypocet casu pre dobre suciastky v hodinach
	{
		Pocet = Suciastky.getPocet();
		CasPrac.cas=(Pocet*2);
		return CasPrac.cas;
	}
}

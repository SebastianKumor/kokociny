package javaModel;

public class DobreSuciastky extends Suciastky {
	
	@Override
	public int setCena(int Cena)
	{
		this.Cena = Cena;
		Cena=(Cena +(Pocet*100));
		return Cena;
	}
	
	@Override
	public int setPocet(int Pocet)
	{
		//this.Pocet=Pocet;
		Cena=(Cena +(Pocet*150));
		return Pocet;
	}	
}

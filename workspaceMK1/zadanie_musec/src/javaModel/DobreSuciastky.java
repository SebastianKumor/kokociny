package javaModel;

public class DobreSuciastky extends Suciastky {
	
	@Override
	public int setCena(int Pocet)
	{
		//this.Cena = Cena;
		Cena=(5000 +(Pocet*100));
	//(5000 +(Pocet*100));
		return Cena;
	}
}

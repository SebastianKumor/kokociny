package javaModel;

/** Uchovava Pocet Cenu a Cas 
 * @author Matus Mucha*/

public class Suciastky {
	protected static int Pocet;
	protected int Cena; 
    protected CasPrac casPrac;	
	

	public static int getPocet() // getter pre pocet
	{
		return Pocet;
	}

	public int setPocet(int Pocet) // setter pre pocet
	{
		Suciastky.Pocet = Pocet;
		return Pocet;
	}

	public int getCena() // getter pre cenu
	{
		return Cena;
	}
	public int setCas(int cas)
	{
		CasPrac.cas=cas;
		return cas;
	}

	public static int getCas()
	{
		return CasPrac.cas;
	}
	
	public int setCena(int Cena)// setter pre cenu
	{
		this.Cena = Cena;
		return Cena;
	}

}

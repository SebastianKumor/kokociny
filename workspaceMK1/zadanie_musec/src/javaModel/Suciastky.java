package javaModel;

import okinko.HlavneOkno;

public class Suciastky {
	protected static int Pocet;
	protected int Cena; // dat vsetko private

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

	public int setCena(int Cena)// setter pre cenu
	{
		this.Cena = Cena;
		return Cena;
	}

}

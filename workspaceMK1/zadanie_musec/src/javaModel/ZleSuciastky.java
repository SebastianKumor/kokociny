package javaModel;

public class ZleSuciastky extends Suciastky {

	@Override
	public int setCena(int Pocet) // Vypocet Ceny pre zle suciastky
	{
		Pocet = Suciastky.getPocet();
		Cena = (Pocet * 350);
		return Cena;
	}
}
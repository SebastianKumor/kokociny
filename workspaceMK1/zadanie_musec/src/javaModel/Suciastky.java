package javaModel;

import okinko.HlavneOkno;

public class Suciastky {
public int Pocet;
public int Cena; // dat vsetko private 


public int getPocet()
{
	return Pocet;
}

public int setPocet(int Pocet)
{
	this.Pocet=Pocet; 
	//System.out.println(Pocet);
	return Pocet;
}	

public int getCena()
{
	return Cena;
}

public int setCena(int Cena)
{
	this.Cena=Cena;
	return Cena;
}

}

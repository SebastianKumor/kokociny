package javaModel;

import okinko.HlavneOkno;

public class Suciastky {
public int Pocet;
public int Cena = 5000;
/*
public Suciastky(int Id)
{
	this.Id = Id;
}
*/
public int getPocet()
{
	return Pocet;
}

public int setPocet(int Pocet)
{
	this.Pocet=Pocet; 
	System.out.println(Pocet);
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
/*
public boolean equals(Object obj)
{
	if(!(obj instanceof Suciastky))
		return false;
	
	Suciastky other=(Suciastky) obj;
	return Id ==(other.Id);
}
*/
}

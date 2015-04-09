package javaModel;

public class Suciastky {
public int Id;
private int Cena=100;
/*
public Suciastky(int Id)
{
	this.Id = Id;
}
*/
public int getId()
{
	return Id;
}

public void setId(int Id)
{
	this.Id=Id;
}
public int getCena()
{
	return Cena;
}

public void setCena(int Cena)
{
	this.Cena=Cena;
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

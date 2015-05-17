package senzors;

import main.Hodnoty;

public class Voda extends Senzor {


	public Voda(int i){
		super(i);
        setMaxhodnota(65);
        meno="Water";
	}
    public Voda(int i,int hodnota){
        super(i);
        setMaxhodnota(hodnota);
        meno="Water";
        System.out.println("Water sensor was successfully created with ID number: '"+get_id()+"'" );

    }

public String check(Hodnoty hodnota){
	
	if(get_maxhodnota() < hodnota.getWater())
	{
		
		
	return super.check(hodnota) + " Water sensor with ID number: " + get_id() + " and with maxvalue: " + get_maxhodnota()+ " %\n";
	}
	else 
		return "";
}
public String vypis_senzorov(){
    return super.vypis_senzorov()+ " Water sensor with maxvalue: " +get_maxhodnota()+ "%\n";
}

	
}

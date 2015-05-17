package senzors;

import main.Hodnoty;

public class Palivo extends Senzor {



	public Palivo(int i){
		super(i);
		setMinhodnota(50);
        meno = "Fuel";
    }

    public Palivo(int i,int hodnota){
        super(i);
        setMinhodnota(hodnota);
        meno="Fuel";
        System.out.println("Fuel sensor was successfully created with ID number: '"+get_id()+"'" );

    }

public String check(Hodnoty hodnota){
		
		if(get_minhodnota() > hodnota.getFuel())
		{
			
			
		return super.check(hodnota) + " Fuel sensor with ID number: " + get_id() + " and with minvalue: " + get_minhodnota()+ " %\n";
		}
		else 
			return "";
	}

    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Fuel sensor with minvalue: " +get_minhodnota()+ "%\n";
    }
}

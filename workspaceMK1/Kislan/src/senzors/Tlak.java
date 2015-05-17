package senzors;

import main.Hodnoty;

public class Tlak extends Senzor{

	public Tlak(int i){
		super(i);
        setMaxhodnota(1050);
        meno="Pressure";
    }

    public Tlak(int i,int hodnota){
        super(i);
        setMaxhodnota(hodnota);
        meno="Pressure";
        System.out.println("Pressure sensor was successfully created with ID number: '"+get_id()+"'" );

    }

	public String check(Hodnoty hodnota){
		
		if(get_maxhodnota() < hodnota.getPressure())
		{
			
			
		return super.check(hodnota) + " Pressure sensor with ID number: " + get_id() + " and with maxvalue: " + get_maxhodnota()+ "\n";
		}
		else 
			return "";
	}

    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Pressure sensor with maxvalue: " +get_maxhodnota()+ "\n";
    }
}

package senzors;

import main.Hodnoty;

public class Rychlost extends Senzor {


	
	public Rychlost(int i){
		super(i);
		setMinhodnota(80);
        meno = "Speed";
    }

    public Rychlost(int i,int hodnota){
        super(i);
        setMinhodnota(hodnota);
        meno="Speed";
        System.out.println("Speed sensor was successfully created wit ID number: '"+get_id()+"'" );

    }

public String check(Hodnoty hodnota){
		
		if(get_minhodnota() > hodnota.getSpeed())
		{
			
			
		return super.check(hodnota) + "Speed sensor with ID number: " + get_id() + " and with minvalue: " + get_minhodnota()+ "\n";
		}
		else 
			return "";
	}

    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Speed sensor with minvalue: " +get_minhodnota()+ "\n";
    }
}

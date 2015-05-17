package senzors;

import main.Hodnoty;

public class Motory extends Senzor {



	public Motory(int i){
		super(i);
		setMinhodnota(100);
        meno = "Motor";
    }

    public Motory(int i,int hodnota){
        super(i);
        setMinhodnota(hodnota);
        meno="Motor";
        System.out.println("Motor sensor was successfully created with ID number : '"+get_id()+"'" );

    }

public String check(Hodnoty hodnota){
		
		if(get_minhodnota() > hodnota.getMotor())
		{
			
			
		return super.check(hodnota) + " Motor sensor with iD number: " + get_id() + " and with minvalue: " + get_minhodnota()+ " %\n";
		}
		else 
			return "";
	}

    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Motor sensor with minvalue: " +get_minhodnota()+ "%\n";
    }
}

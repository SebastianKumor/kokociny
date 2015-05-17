package senzors;


import main.Hodnoty;

public class O2 extends Senzor{


	
	public O2(int i){
		super(i);
		setMinhodnota(80);
        meno = "Oxygen";
    }

    public O2(int i,int hodnota){
        super(i);
        setMinhodnota(hodnota);
        meno="Oxygen";
        System.out.println("Oxygen sensor was successfully created with ID number: '"+get_id()+"'" );

    }

public String check(Hodnoty hodnota){
		
		if(get_minhodnota() > hodnota.getOxygen())
		{
			
			
		return super.check(hodnota) + " Oxygen sensor with ID number: " + get_id() + " and with minvalue: " + get_minhodnota()+ " %\n";
		}
		else 
			return "";
	}
    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Oxygen sensor with minvalue: " +get_minhodnota()+ "%\n";
    }
}

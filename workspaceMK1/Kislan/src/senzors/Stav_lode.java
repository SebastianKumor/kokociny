package senzors;
import main.Hodnoty;

public class Stav_lode extends Senzor {

	public Stav_lode(int i){
		super(i);
        setMinhodnota(100);
        meno="Hull";
	}

    public Stav_lode(int i,int hodnota){
        super(i);
        setMinhodnota(hodnota);
        meno="Hull";
        System.out.println("Hull sensor was successfully created with ID number: '"+get_id()+"'" );

    }

public String check(Hodnoty hodnota){
		
		if(get_minhodnota() > hodnota.getHull())
		{
			
			
		return super.check(hodnota) + " Hull sensor with ID number: " + get_id() + " and with minvalue: " + get_minhodnota()+ " %\n";
		}
		else 
			return "";
	}
    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Hull sensor with minvalue: " +get_minhodnota()+ "%\n";
    }
}

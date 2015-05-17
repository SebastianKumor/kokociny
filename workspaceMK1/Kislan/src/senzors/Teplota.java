package senzors;
import main.Hodnoty;

public class Teplota extends Senzor {



	public Teplota(int i){
		super(i);
        setMaxhodnota(30);
        meno="Temperature";
    }

    public Teplota(int i,int hodnota){
        super(i);
        setMaxhodnota(hodnota);
        meno="Temperature";
        System.out.println("Temperature sensor was successfully created with ID number: '"+get_id()+"'" );

    }

	public String check(Hodnoty hodnota){
		
		if(get_maxhodnota() < hodnota.getTemperature())
		{
			
			
		return super.check(hodnota) + " Temperature sensor with ID number: " + get_id() + " and with maxvalue: " + get_maxhodnota()+ "\n";
		}
		else 
			return "";
	}
    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Temperature sensor with maxvalue: " +get_maxhodnota()+ "\n";
    }
}

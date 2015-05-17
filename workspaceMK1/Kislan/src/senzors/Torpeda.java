package senzors;

import main.Hodnoty;

public class Torpeda extends Senzor {



	public Torpeda(int i){
		super(i);
        meno="Missiles";
    }
    public Torpeda(int i,int hodnota){
        super(i);
        meno="Missiles";
        System.out.println("Missiles sensor was successfully created with ID number: '"+get_id()+"'" );
    }

    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Missiles sensor \n";
    }


    public String check(Hodnoty hodnota){

            return "";
    }


}

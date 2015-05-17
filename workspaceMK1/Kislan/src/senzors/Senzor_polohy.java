package senzors;

import main.Hodnoty;

public class Senzor_polohy extends Senzor {



	public Senzor_polohy(int i){
		super(i);
        meno="Position";
    }
    public Senzor_polohy(int i,int hodnota){
        super(i);
        meno="Position";
        System.out.println("Position sensor was successfully created with ID number: '"+get_id()+"'" );
    }


    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Position sensor\n";
    }


    public String check(Hodnoty hodnota){

            return "";
    }
}

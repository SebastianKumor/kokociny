package senzors;

import main.Hodnoty;

public class Miny extends Senzor {


	
	public Miny(int i){
		super(i);
        meno = "Mine";
    }
    public Miny(int i,int hodnota){
        super(i);
        meno = "Mine";
        System.out.println("Mine sensor was successfully created with ID number : '"+get_id()+"'" );
    }

    public String vypis_senzorov(){
        return super.vypis_senzorov()+ " Mine sensor\n";
    }


    public String check(Hodnoty hodnota){

            return "";
    }

}

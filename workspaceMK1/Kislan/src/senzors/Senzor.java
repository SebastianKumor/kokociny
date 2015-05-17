package senzors;

import main.Hodnoty;

public class Senzor implements vypis {
	private int id;
    private boolean funkcny;
    protected String meno;
    private int maxhodnota;
    private int minhodnota;

    public Senzor(int i){
		this.id=i;
        this.funkcny=true;

	}
    public Senzor(int i,int hodnota){
        this.id=i;
        this.funkcny=true;
    }


    /**
     * method for checking sensor's values
     *
     * @param hodnota
     *      for comparing values
     *
     * @return string
     *          which will be printed on textarea
     */
    public String check(Hodnoty hodnota){
    	
    	return "Alarm caused by ";
    }
    /**
     * method for checking sensor's values
     *
     * @return string
     *          which will be printed on textarea
     */
    public String vypis_senzorov(){
               return "ID: " + this.id + " -->";
    }
    
	public int get_id(){
        return id;
    }

    public boolean get_funkcny(){
	return funkcny;
	}

    public void oprava (){
        if(!funkcny) {
            this.funkcny = true;
        }
    }

    public void setfunkcny(){
        this.funkcny = !funkcny;


    }
    public String getMeno(){
        return meno;
    }


    public int get_maxhodnota(){
        return maxhodnota;
    }


    public int get_minhodnota(){
        return minhodnota;
    }

    public void setMaxhodnota(int i){
        maxhodnota=i;

    }

   public void setMinhodnota(int i){
        minhodnota=i;
    }


	

}

package javaModel;

import okinko.HlavneOkno;

public class Stav {

	private boolean schvalene;
	private boolean uspesnaKontrola;
	private boolean komponentyKupene;
	private boolean hotovyProjekt;
	
	
	
	public Stav()//boolean schvalene, boolean uspesnaKontrola,boolean komponentyKupene//)
			{
		
		this.schvalene = false;
		this.uspesnaKontrola = false;
		this.komponentyKupene = false;
		this.hotovyProjekt = false;
		
	}
	
	public void setSchvalene(boolean schvalene){
		
		this.schvalene=schvalene;
	}
	
	public void setUspesnaKontrola(boolean uspesnaKontrola){
		
		this.uspesnaKontrola=uspesnaKontrola;
		
	}
	
	public void setKomponentyKupene(boolean komponentyKupene){
		
		this.komponentyKupene = komponentyKupene; 
 	}
	
	public void setHotovyProjekt(boolean hotovyProjekt){
		
		this.hotovyProjekt = hotovyProjekt;
	}

	public boolean getSchvalene(){
		
		return schvalene; 
	}
	public boolean getUspesnaKontrola(){
		
		return uspesnaKontrola;
	}
	
	public boolean getKomponentyKupene(){
		
		return komponentyKupene;	
	}
	
	public boolean getHotovyProjekt(){
		
		return hotovyProjekt;	
	}
	
	public boolean isEverythingOk(){
	      return (schvalene && uspesnaKontrola && komponentyKupene && hotovyProjekt);
	   }
	

}

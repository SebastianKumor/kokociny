package javaModel;

import okinko.HlavneOkno;

public class Stav {

	private boolean schvalene;
	private boolean uspesnaKontrola;
	private boolean realizacia;
	private boolean hotovyProjekt;
	
	
	private Suciastky nah = new Suciastky(); // akoze agregacia davat dakych viac classov do skine dake kable suciastky keketiny
	int i = 	nah.getCena();
	
	public Stav()//boolean schvalene, boolean uspesnaKontrola,boolean komponentyKupene//)
			{
		this.schvalene = false;
		this.uspesnaKontrola = false;
		this.realizacia = false;
		this.hotovyProjekt = false;	
	}
	
	public void setSchvalene(boolean schvalene){
		
		this.schvalene=schvalene;
	}
	
	public void setUspesnaKontrola(boolean uspesnaKontrola){
		
		this.uspesnaKontrola=uspesnaKontrola;
		
	}
	
	public void setRealizacia(boolean komponentyKupene){
		
		this.realizacia = realizacia; 
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
	
	public boolean getRealizacia(){
		
		return realizacia;	
	}
	
	public boolean getHotovyProjekt(){
		
		return hotovyProjekt;	
	}
	
	public boolean isEverythingOk(){
	      return (schvalene && uspesnaKontrola && realizacia && hotovyProjekt);
	   }
	

}

package javaModel;

/** Trieda obsahuje stav projektu v privatnych boolean premennych
 * @author Matus Mucha*/

public class Stav { // class obsahujuci informacie ohladom aktualneho stavu projektu
	private boolean schvalene;
	private boolean uspesnaKontrola;
	private boolean realizacia;
	private boolean hotovyProjekt;

	private Suciastky nah = new Suciastky(); 

	/** definicia boolovych premennych*/
	public Stav()
	{
		/**
		 * 
		 */
		this.schvalene = false;
		this.uspesnaKontrola = false;
		this.realizacia = false;
		this.hotovyProjekt = false;
	}

	// gettery a settery jednotlivych stavov
	public void setSchvalene(boolean schvalene) {

		this.schvalene = schvalene;
	}

	public void setUspesnaKontrola(boolean uspesnaKontrola) {

		this.uspesnaKontrola = uspesnaKontrola;
	}

	public void setRealizacia(boolean realizacia) {

		this.realizacia = realizacia;
	}

	public void setHotovyProjekt(boolean hotovyProjekt) {

		this.hotovyProjekt = hotovyProjekt;
	}

	public boolean getSchvalene() {

		return schvalene;
	}

	public boolean getUspesnaKontrola() {

		return uspesnaKontrola;
	}

	public boolean getRealizacia() {

		return realizacia;
	}

	public boolean getHotovyProjekt() {

		return hotovyProjekt;
	}

	public boolean isEverythingOk() {
		return (schvalene && uspesnaKontrola && realizacia && hotovyProjekt);
	}

	public Suciastky getNah() {
		return nah;
	}

	public void setNah(Suciastky nah) {
		this.nah = nah;
	}

}

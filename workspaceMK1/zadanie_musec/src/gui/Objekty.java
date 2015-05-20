
package gui;

import javaModel.DobreSuciastky;
import javaModel.Stav;
import javaModel.Suciastky;
import javaModel.ZleSuciastky;

/** Definicia objektov potrebnych na funkciu 
@author Matus Mucha*/
public interface Objekty { // interface obsahujuci objekty z gui

	public Stav stav = new Stav();
	public Stav stav2 = new Stav();
	public Stav stav3 = new Stav();
	public Stav stav4 = new Stav();
	public Suciastky pocetSuciastok = new Suciastky();
	public DobreSuciastky fajneSuc = new DobreSuciastky();
	public ZleSuciastky nanicSuc = new ZleSuciastky();

}
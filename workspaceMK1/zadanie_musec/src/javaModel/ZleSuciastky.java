package javaModel;

public class ZleSuciastky extends Suciastky {	
	
		@Override
		public int setCena(int Cena)
		{
			Cena=(5000 + (Pocet*50));
			return Cena;
		}
}
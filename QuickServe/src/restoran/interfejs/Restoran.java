package restoran.interfejs;

import java.util.LinkedList;

import artikal.Artikal;
import restoran.sistemskeoperacije.SODodajArtikal;

public class Restoran implements RestoranInterfejs {
	public LinkedList<Artikal> racun = new LinkedList<Artikal>();
	@Override
	public void poruciArtikal(Artikal a) {
		
		SODodajArtikal.izvrsi(a, racun);
		
	}

	@Override
	public double racunaUkupanIznosRacuna() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LinkedList<Artikal> vratiRacun() {
		// TODO Auto-generated method stub
		return null;
	}

}

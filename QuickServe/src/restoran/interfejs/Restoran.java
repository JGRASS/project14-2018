package restoran.interfejs;

import java.util.LinkedList;

import artikal.Artikal;
import restoran.sistemskeoperacije.SODodajArtikal;
import restoran.sistemskeoperacije.SORacunZaUkupanIznosRacuna;

public class Restoran implements RestoranInterfejs {
	public LinkedList<Artikal> racun = new LinkedList<Artikal>();
	@Override
	public void poruciArtikal(Artikal a) {
		
		SODodajArtikal.izvrsi(a, racun);
		
	}

	@Override
	public double racunaUkupanIznosRacuna() {
		return SORacunZaUkupanIznosRacuna.izvrsi(racun);
	}

	@Override
	public LinkedList<Artikal> vratiRacun() {
		return racun;
	}

}

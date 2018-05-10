package restoran.interfejs;

import java.util.LinkedList;

import artikal.Artikal;
import restoran.sistemskeoperacije.SODodajArtikal;
import restoran.sistemskeoperacije.SORacunZaUkupanIznosRacuna;

/**
 * Klasa Restoran koja implementira interfejs u paketu restoran
 * 
 * @author Nemanja, Jovana i Andjela
 */
public class Restoran implements RestoranInterfejs {
	/**
	 * Atribut koji prikazuje listu artikala, tj. racun
	 */
	public LinkedList<Artikal> racun = new LinkedList<Artikal>();

	/**
	 * Metoda koja dodaje artikal u racun
	 * 
	 * @param Artikal
	 *            a
	 * 
	 */
	@Override
	public void poruciArtikal(Artikal a) {

		SODodajArtikal.izvrsi(a, racun);

	}

	/**
	 * Metoda koja racuna ukupan iznos racuna
	 */
	@Override
	public double racunaUkupanIznosRacuna() {
		return SORacunZaUkupanIznosRacuna.izvrsi(racun);
	}

	/**
	 * Metoda koja vraca racun
	 * 
	 * @return racun, lista artikla
	 */
	@Override
	public LinkedList<Artikal> vratiRacun() {
		return racun;
	}

}

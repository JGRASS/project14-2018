package restoran.interfejs;

import java.util.LinkedList;

import artikal.Artikal;

/**
 * 
 * Interfejs u paketu restoran
 * 
 * @author Nemanja, Jovana i Andjela
 *
 */
public interface RestoranInterfejs {
	/**
	 * Metoda koja dodaje artikal u racun
	 * 
	 * @param Artikal
	 */

	public void poruciArtikal(Artikal a);

	/**
	 * Metoda koja racuna ukupan iznos racuna
	 */
	public double racunaUkupanIznosRacuna();

	/**
	 * Metoda koja vraca racun
	 * 
	 * @return racun, lista artikla
	 */
	public LinkedList<Artikal> vratiRacun();
}

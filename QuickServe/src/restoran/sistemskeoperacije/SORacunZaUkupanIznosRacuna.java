package restoran.sistemskeoperacije;

import java.util.LinkedList;

import artikal.Artikal;
/**
 * Klasa sa metodom koja racuna iznos racuna
 * 
 * @author Nemanja, Jovana i Andjela
 *
 */
public class SORacunZaUkupanIznosRacuna {
	/**
	 * Metoda koja racuna ukupan iznos racuna
	 * 
	 * @param racun
	 * @return iznos racuna, double
	 */
	public static double izvrsi(LinkedList<Artikal> racun) {
		double iznos = 0;
		for (int i = 0; i < racun.size(); i++) {
			iznos += racun.get(i).cena;
		}
		return iznos;
	}
}

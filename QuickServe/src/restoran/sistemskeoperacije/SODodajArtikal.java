package restoran.sistemskeoperacije;

import java.util.LinkedList;

import artikal.Artikal;

/**
 * Klasa sa metodom dodaj artikal
 * 
 * @author Nemanja, Jovana i Andjela
 *
 */
public class SODodajArtikal {

	/**
	 * Metoda koja dodaje artikal u listu
	 * 
	 * @param a
	 * @param racun
	 */
	public static void izvrsi(Artikal a, LinkedList<Artikal> racun) {
		if (a == null)
			throw new RuntimeException("Artikal ne sme biti null!");
		racun.add(a);
	}
}

package restoran.sistemskeoperacije;

import java.util.LinkedList;

import artikal.Artikal;

public class SORacunZaUkupanIznosRacuna {
	public static double izvrsi(LinkedList<Artikal> racun) {
		double iznos = 0;
		for (int i = 0; i < racun.size(); i++) {
			iznos += racun.get(i).cena;
		}
		return iznos;
	}
}

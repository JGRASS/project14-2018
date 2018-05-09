package restoran.sistemskeoperacije;

import java.util.LinkedList;

import artikal.Artikal;

public class SODodajArtikal {
	public static void izvrsi(Artikal a, LinkedList<Artikal> racun) {
		if (a == null)
			throw new RuntimeException("Artikal ne sme biti null!");
		racun.add(a);
	}
}

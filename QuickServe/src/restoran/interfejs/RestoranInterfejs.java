package restoran.interfejs;

import java.util.LinkedList;

import artikal.Artikal;

public interface RestoranInterfejs {
	public void poruciArtikal(Artikal a);

	public double racunaUkupanIznosRacuna();

	public LinkedList<Artikal> vratiRacun();
}

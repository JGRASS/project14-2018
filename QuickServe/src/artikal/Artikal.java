package artikal;

import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Artikal {

	public String naziv;

	public double cena;

	public LinkedList<String> sastojci;

	public String slika;

	public Icon image;

	public String tip;

	public Artikal(double cena, String naziv, String putanjaSlike, LinkedList<String> sastojci, String tip) {
		this.naziv = naziv;
		this.cena = cena;
		image = new ImageIcon(getClass().getResource(putanjaSlike));
		this.sastojci = sastojci;
		this.tip = tip;
	}

	public Artikal(double cena, String naziv, String tip) {
		this.naziv = naziv;
		this.cena = cena;
		this.tip = tip;

	}
}

package artikal;

import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 * 
 * Klasa Artikal u paketu artikal
 * 
 * @author Nemanja, Jovana i Andjela
 * @version 1.0
 *
 */
public class Artikal {
	/**
	 * Atribut koji prikazuje naziv artikla, String
	 */
	public String naziv;
	/**
	 * Atribut koji prikazuje cenu artikla, double
	 */
	public double cena;
	/**
	 * Atribut koji prikazuje sastojke, lista Stringova
	 */
	public LinkedList<String> sastojci;
	/**
	 * Atribut koji prikazuje sliku artikla, String
	 */
	public String slika;
	/**
	 * Atribut koji prikazuje ikonu artikla, Icon
	 */
	public Icon image;
	/**
	 * Atribut koji prikazuje tip artikla, String
	 */
	public String tip;

	/**
	 * Konstruktor koji pravi novi Artikal
	 * 
	 * @param cena
	 * @param naziv
	 * @param putanjaSlike
	 * @param sastojci
	 * @param tip
	 */
	public Artikal(double cena, String naziv, String putanjaSlike, LinkedList<String> sastojci, String tip) {
		this.naziv = naziv;
		this.cena = cena;
		image = new ImageIcon(getClass().getResource(putanjaSlike));
		this.sastojci = sastojci;
		this.tip = tip;
	}
	/**
	 * Konstruktor koji pravi novi Artikal za serijalizaciju
	 * 
	 * @param cena
	 * @param naziv
	 * @param tip
	 */
	public Artikal(double cena, String naziv, String tip) {
		this.naziv = naziv;
		this.cena = cena;
		this.tip = tip;

	}
}

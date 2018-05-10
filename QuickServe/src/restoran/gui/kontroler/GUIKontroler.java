package restoran.gui.kontroler;

import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.LinkedList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import artikal.Artikal;
import restoran.gui.GlavniProzor;
import restoran.gui.HranaProzor;
import restoran.gui.KonobarovPrikaz;
import restoran.gui.PicaProzor;
import restoran.gui.PicaProzorHappyHour;
import restoran.gui.PotvrdiPorudzbinuHraneDijalog;
import restoran.gui.PotvrdiPorudzbinuPicaDijalog;
import restoran.gui.PotvrdiPorudzbinuPicaHappyHour;
import restoran.interfejs.Restoran;
import restoran.interfejs.RestoranInterfejs;

public class GUIKontroler {

	public static RestoranInterfejs restoran = new Restoran();
	public static GlavniProzor gp;
	private final static String newline = "\n";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKontroler.gp = new GlavniProzor();
					GUIKontroler.gp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void prikaziHranaProzor() {
		HranaProzor hp = new HranaProzor();
		hp.setLocationRelativeTo(gp);
		hp.setVisible(true);
	}

	public static void prikaziPicaProzor() {
		PicaProzor pp = new PicaProzor();
		pp.setLocationRelativeTo(gp);
		pp.setVisible(true);

	}

	public static void poruci(Artikal a, LinkedList<String> izabraniSastojci) {
		a.sastojci = izabraniSastojci;
		restoran.poruciArtikal(a);
		ispis(a);
		uJson(a);

	}

	public static void prikaziPotvrdiPorudzbinuHraneDijalog(Artikal a) {
		PotvrdiPorudzbinuHraneDijalog dij = new PotvrdiPorudzbinuHraneDijalog(a);
		dij.setLocationRelativeTo(gp);
		dij.setVisible(true);
	}

	public static void uJson(Artikal a) {
		Artikal a1 = new Artikal(a.cena, a.naziv, a.tip);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String porudz = gson.toJson(a1);

		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("data/history.json", true)));
			writer.println(new Date());
			writer.println(porudz);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ispis(Artikal a) {

		gp.textArea.append(a.naziv + "............." + a.cena + newline);

	}

	public static void racunTextArea() {
		gp.textArea.append("---------------------------------" + newline);
		gp.textArea.append("KONOBAR CE DOCI SA VASIM RACUNOM" + newline);
		gp.textArea.append("Ukupan iznos vaseg racuna je: " + restoran.racunaUkupanIznosRacuna() + newline);

		gp.textArea.append("HVALA NA POSETI!" + newline);
	}

	public static void prikaziPicaProzorHappyHour() {
		PicaProzorHappyHour pp = new PicaProzorHappyHour();
		pp.setLocationRelativeTo(gp);
		pp.setVisible(true);

	}

	public static void prikaziPotvrdiPorudzbinuHappyHourPicaDijalog(Artikal a) {
		PotvrdiPorudzbinuPicaHappyHour dij = new PotvrdiPorudzbinuPicaHappyHour(a);
		dij.setLocationRelativeTo(gp);
		dij.setVisible(true);
	}

	public static void prikaziPotvrdiPorudzbinuPicaDijalog(Artikal a) {
		PotvrdiPorudzbinuPicaDijalog dij = new PotvrdiPorudzbinuPicaDijalog(a);
		dij.setLocationRelativeTo(gp);
		dij.setVisible(true);
	}

	public static void prikaziKonobarProzor(Artikal a) {
		KonobarovPrikaz kp = new KonobarovPrikaz();
		kp.setVisible(true);
	}

	public static void prikaziKonobarProzorPomoc() {
		KonobarovPrikaz kp = new KonobarovPrikaz();
		kp.setVisible(true);
	}

}

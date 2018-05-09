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
import restoran.gui.PotvrdiPorudzbinuHraneDijalog;
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
		
		gp.textArea.append(a.naziv + "............." +a.cena + newline);
		 
		
}
	

	
}

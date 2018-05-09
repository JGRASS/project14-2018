package restoran.gui.kontroler;

import java.awt.EventQueue;
import java.util.LinkedList;

import artikal.Artikal;
import restoran.gui.GlavniProzor;
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
	

	
}

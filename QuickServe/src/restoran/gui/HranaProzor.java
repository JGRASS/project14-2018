package restoran.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import artikal.Artikal;
import restoran.gui.kontroler.GUIKontroler;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;

import java.util.LinkedList;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class HranaProzor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public HranaProzor() {
		setTitle("Hrana");
		setIconImage(Toolkit.getDefaultToolkit().getImage(HranaProzor.class.getResource("/logo/logo.jpeg")));
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 556, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setToolTipText("Paste");
		separator.setBounds(12, 228, 514, 10);
		contentPane.add(separator);

		JLabel lblGlavnaJela = new JLabel("Glavna jela");
		lblGlavnaJela.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGlavnaJela.setBounds(12, 13, 108, 28);
		contentPane.add(lblGlavnaJela);

		JLabel lblBiftek = new JLabel("Biftek");
		lblBiftek.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBiftek.setBounds(12, 69, 91, 19);
		contentPane.add(lblBiftek);

		JLabel lblLazanjeSaTikvicom = new JLabel("<html>Lazanje sa tikvicom i sirom<br/></html>");
		lblLazanjeSaTikvicom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLazanjeSaTikvicom.setBounds(12, 101, 108, 52);
		contentPane.add(lblLazanjeSaTikvicom);

		JLabel lblpiletinaSaPrazilukom = new JLabel("<html>Piletina sa prazilukom<br/> </html>");
		lblpiletinaSaPrazilukom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpiletinaSaPrazilukom.setBounds(12, 166, 127, 37);
		contentPane.add(lblpiletinaSaPrazilukom);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Biftek.PNG")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Grilovano povrce");
				sastojci.add("Pekarski krompir");
				sastojci.add("Sveze pecena kajzerica");
				Artikal a = new Artikal(1200, "Biftek", "/hrana/Biftek.PNG", sastojci, "gl");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button.setBounds(155, 57, 108, 52);
		contentPane.add(button);

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Lazanja.jpg")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Zelena salata");
				sastojci.add("Parmezan");
				Artikal a = new Artikal(720, "Lazanje sa tikvicama i sirom", "/hrana/Lazanja.JPG", sastojci, "gl");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_1.setBounds(155, 111, 108, 52);
		contentPane.add(button_1);

		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Pomfrit");
				sastojci.add("Sir");
				// sastojci.add("Sveze pecena kajzerica");
				Artikal a = new Artikal(740, "Piletina sa prazilukom", "/hrana/Piletina sa prazilukom.JPG", sastojci,
						"gl");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);

			}
		});
		button_2.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Piletina sa prazilukom.JPG")));
		button_2.setBounds(155, 166, 108, 52);
		contentPane.add(button_2);

		JLabel lblPaniraniRibljiFileti = new JLabel("<html> Panirani riblji fileti<br/></html>");
		lblPaniraniRibljiFileti.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPaniraniRibljiFileti.setBounds(275, 116, 91, 37);
		contentPane.add(lblPaniraniRibljiFileti);

		JLabel lblmeksikaMusaka = new JLabel("<html>Meksi\u010Dka musaka<br/> </html>");
		lblmeksikaMusaka.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblmeksikaMusaka.setBounds(275, 166, 127, 37);
		contentPane.add(lblmeksikaMusaka);

		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Miks zelenih salata");
				sastojci.add("Pire krompir");
				// sastojci.add("");
				// sastojci.add("Sveze pecena kajzerica");
				Artikal a = new Artikal(660, "Meksicka musaka", "/hrana/Mekiscka musaka.JPG", sastojci, "gl");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_3.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Mekiscka musaka.jpg")));
		button_3.setBounds(418, 166, 108, 52);
		contentPane.add(button_3);

		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Krompir salata");
				sastojci.add("Pomfrit");
				sastojci.add("Sve� beli luk");
				// sastojci.add("Sveze pecena kajzerica");
				Artikal a = new Artikal(540, "Panirani riblji file", "/hrana/Panirani riblji file.JPG", sastojci, "gl");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_4.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Panirani riblji file.jpg")));
		button_4.setBounds(418, 111, 108, 52);
		contentPane.add(button_4);

		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Bez senfa");
				sastojci.add("Pomfrit");
				// sastojci.add("Sveze pecena kajzerica");
				Artikal a = new Artikal(870, "Piletina u sosu od jogurta i senfa",
						"/hrana/Piletina u sosu od jogurta i senfa.JPG", sastojci, "gl");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_5.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Piletina u sosu od jogurta i senfa.jpg")));
		button_5.setBounds(418, 57, 108, 52);
		contentPane.add(button_5);

		JLabel lblpiletinaUSosu = new JLabel("<html>Piletina u sosu od jogurta i senfa<br/></html>");
		lblpiletinaUSosu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpiletinaUSosu.setBounds(275, 57, 127, 45);
		contentPane.add(lblpiletinaUSosu);

		JLabel lblPaste = new JLabel("Paste");
		lblPaste.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPaste.setBounds(12, 256, 108, 28);
		contentPane.add(lblPaste);

		JLabel lblKarbonara = new JLabel("Karbonara");
		lblKarbonara.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKarbonara.setBounds(12, 310, 91, 19);
		contentPane.add(lblKarbonara);

		JLabel lblMilanese = new JLabel("Milanese\r\n");
		lblMilanese.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMilanese.setBounds(12, 342, 108, 52);
		contentPane.add(lblMilanese);

		JLabel lblBolonjeze = new JLabel("Bolonjeze");
		lblBolonjeze.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBolonjeze.setBounds(12, 407, 127, 37);
		contentPane.add(lblBolonjeze);

		JLabel lblpastaSaPlodovima = new JLabel("<html>Pasta sa plodovima mora<br/> </html>");
		lblpastaSaPlodovima.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpastaSaPlodovima.setBounds(275, 407, 127, 37);
		contentPane.add(lblpastaSaPlodovima);

		JLabel lblPastaSaPiletinom = new JLabel("<html> Pasta sa piletinom i pesto sosom<br/></html>");
		lblPastaSaPiletinom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPastaSaPiletinom.setBounds(271, 360, 131, 37);
		contentPane.add(lblPastaSaPiletinom);

		JLabel lblVrsteSira = new JLabel("4 vrste sira");
		lblVrsteSira.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVrsteSira.setBounds(275, 298, 127, 45);
		contentPane.add(lblVrsteSira);

		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Pata karbonara.jpg")));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Taljatele");
				sastojci.add("Pene");
				sastojci.add("Spagete");
				Artikal a = new Artikal(640, "Pasta karbonara", "/hrana/Pata karbonara.JPG", sastojci, "pa");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_6.setBounds(155, 298, 108, 52);
		contentPane.add(button_6);

		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Taljatele");
				sastojci.add("Pene");
				sastojci.add("Spagete");
				Artikal a = new Artikal(650, "Pasta milanese", "/hrana/Pata milanesse.JPG", sastojci, "pa");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_7.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Pata milanesse.jpg")));
		button_7.setBounds(155, 352, 108, 52);
		contentPane.add(button_7);

		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Taljatele");
				sastojci.add("Pene");
				sastojci.add("Spagete");
				Artikal a = new Artikal(630, "Pasta bolonjeze", "/hrana/Pasta bolognese.JPG", sastojci, "pa");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_8.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Pasta bolognese.jpg")));
		button_8.setBounds(155, 407, 108, 52);
		contentPane.add(button_8);

		JButton button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Taljatele");
				sastojci.add("Pene");
				sastojci.add("Spagete");
				Artikal a = new Artikal(700, "Pasta sa plodovima mora", "/hrana/Pasta sa plodovima mora.JPG", sastojci,
						"pa");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_9.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Pasta sa plodovima mora.jpg")));
		button_9.setBounds(418, 407, 108, 52);
		contentPane.add(button_9);

		JButton button_10 = new JButton("");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Taljatele");
				sastojci.add("Pene");
				sastojci.add("Spagete");
				Artikal a = new Artikal(640, "Pasta sa piletinom i pesto sosom",
						"/hrana/Patsa sa piletinom i pestom.JPG", sastojci, "pa");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_10.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Patsa sa piletinom i pestom.jpg")));
		button_10.setBounds(418, 352, 108, 52);
		contentPane.add(button_10);

		JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Taljatele");
				sastojci.add("Pene");
				sastojci.add("Spagete");
				Artikal a = new Artikal(640, "Pasta 4 vrste sira", "/hrana/Patsa 4 vrste sira.JPG", sastojci, "pa");
				GUIKontroler.prikaziPotvrdiPorudzbinuHraneDijalog(a);
			}
		});
		button_11.setIcon(new ImageIcon(HranaProzor.class.getResource("/hrana/Patsa 4 vrste sira.jpg")));
		button_11.setBounds(418, 298, 108, 52);
		contentPane.add(button_11);
	}
	private void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(contentPane, "Da li zaista zelite da izadjete iz apliacije",
				"Izlazak", JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}

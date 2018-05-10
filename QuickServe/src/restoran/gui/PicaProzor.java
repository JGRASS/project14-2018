package restoran.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import artikal.Artikal;
import restoran.gui.kontroler.GUIKontroler;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;

import java.util.LinkedList;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class PicaProzor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PicaProzor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PicaProzor.class.getResource("/logo/logo.jpeg")));
		setTitle("Pica");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 593, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setToolTipText("Paste");
		separator.setBounds(12, 228, 514, 10);
		contentPane.add(separator);

		JLabel lblGlavnaJela = new JLabel("Napici od kafe");
		lblGlavnaJela.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGlavnaJela.setBounds(12, 13, 186, 28);
		contentPane.add(lblGlavnaJela);

		JLabel lblBiftek = new JLabel("Domaca kafa");
		lblBiftek.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBiftek.setBounds(22, 70, 108, 19);
		contentPane.add(lblBiftek);

		JLabel lblLazanjeSaTikvicom = new JLabel("Macchiato");
		lblLazanjeSaTikvicom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLazanjeSaTikvicom.setBounds(22, 111, 108, 52);
		contentPane.add(lblLazanjeSaTikvicom);

		JLabel lblpiletinaSaPrazilukom = new JLabel("Mocha");
		lblpiletinaSaPrazilukom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpiletinaSaPrazilukom.setBounds(285, 10, 127, 37);
		contentPane.add(lblpiletinaSaPrazilukom);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/domaca kafa.PNG")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Mleko");
				sastojci.add("Stevia");
				
				Artikal a = new Artikal(240, "Domaca kafa", "/pica/domaca kafa.PNG", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button.setBounds(155, 57, 108, 52);
		contentPane.add(button);

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/makijato.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Sojino mleko");
				sastojci.add("Stevia");
				
				Artikal a = new Artikal(260, "Macchiato", "/pica/makijato.png", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button_1.setBounds(155, 111, 108, 52);
		contentPane.add(button_1);

		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Sojino mleko");
				sastojci.add("Stevia");
				
				Artikal a = new Artikal(240, "Mocha", "/pica/moka.png", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);

			}
		});
		button_2.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/moka.png")));
		button_2.setBounds(285, 57, 91, 122);
		contentPane.add(button_2);

		JLabel lblmeksikaMusaka = new JLabel("Espresso");
		lblmeksikaMusaka.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblmeksikaMusaka.setBounds(22, 178, 82, 37);
		contentPane.add(lblmeksikaMusaka);

		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Sojino mleko");
				sastojci.add("Stevia");
				
				Artikal a = new Artikal(240, "Espresso", "/pica/esspreso.jpg", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button_3.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/esspreso.jpg")));
		button_3.setBounds(155, 164, 108, 52);
		contentPane.add(button_3);

		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Sojino mleko");
				sastojci.add("Stevia");
				
				Artikal a = new Artikal(300, "Ice coffee", "/pica/icecaffe.jpg", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
				
			}
		});
		button_5.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/icecaffe.jpg")));
		button_5.setBounds(418, 57, 108, 122);
		contentPane.add(button_5);

		JLabel lblpiletinaUSosu = new JLabel("Ice coffee");
		lblpiletinaUSosu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpiletinaUSosu.setBounds(418, 6, 127, 45);
		contentPane.add(lblpiletinaUSosu);

		JLabel lblPaste = new JLabel("Svezi sokovi");
		lblPaste.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPaste.setBounds(12, 243, 140, 28);
		contentPane.add(lblPaste);

		JLabel lblKarbonara = new JLabel("Limunada");
		lblKarbonara.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKarbonara.setBounds(12, 310, 127, 19);
		contentPane.add(lblKarbonara);

		JLabel lblMilanese = new JLabel("<html> Cedjena pomorandza <br/></html>");
		lblMilanese.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMilanese.setBounds(12, 431, 108, 52);
		contentPane.add(lblMilanese);

		JLabel lblBolonjeze = new JLabel("<html> Cedjeni grejp<br/></html>");
		lblBolonjeze.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBolonjeze.setBounds(12, 581, 127, 37);
		contentPane.add(lblBolonjeze);

		JLabel lblpastaSaPlodovima = new JLabel("<html> Mix jagoda, breskva, banana<br/></html>");
		lblpastaSaPlodovima.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpastaSaPlodovima.setBounds(275, 571, 127, 37);
		contentPane.add(lblpastaSaPlodovima);

		JLabel lblPastaSaPiletinom = new JLabel("<html>Mix nar, spanac, jabuka <br/></html>");
		lblPastaSaPiletinom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPastaSaPiletinom.setBounds(275, 439, 131, 37);
		contentPane.add(lblPastaSaPiletinom);

		JLabel lblVrsteSira = new JLabel("<html> Mix sargarepa, pomorandza, limun <br/></html>");
		lblVrsteSira.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVrsteSira.setBounds(275, 298, 127, 45);
		contentPane.add(lblVrsteSira);

		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/limunada.jpg")));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Listici mente");
				sastojci.add("Led");
				sastojci.add("Secer");
				
				
				Artikal a = new Artikal(250, "Limunada", "/pica/limunada.jpg", sastojci, "sok");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button_6.setBounds(155, 267, 108, 100);
		contentPane.add(button_6);

		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Led");
				sastojci.add("Limun");
				
				Artikal a = new Artikal(300, "Cedjena pomorandza", "/pica/cedjena-pomorandza.jpg", sastojci, "sok");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button_7.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/cedjena-pomorandza.jpg")));
		button_7.setBounds(155, 430, 108, 75);
		contentPane.add(button_7);

		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Cedjena pomorandza");
				sastojci.add("Led");
				
				Artikal a = new Artikal(310, "Cedjeni grejp", "/pica/grejp.jpg", sastojci, "sok");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button_8.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/grejp.jpg")));
		button_8.setBounds(155, 564, 108, 75);
		contentPane.add(button_8);

		JButton button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				//sastojci.add("Sojino mleko");
				//sastojci.add("Stevia");
				
				Artikal a = new Artikal(370, "Mix jagoda, breskva, banana", "/pica/jagoda banana.jpg", sastojci, "sok1");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button_9.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/jagoda banana.jpg")));
		button_9.setBounds(418, 534, 108, 121);
		contentPane.add(button_9);

		JButton button_10 = new JButton("");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				//sastojci.add("Sojino mleko");
				//sastojci.add("Stevia");
				
				Artikal a = new Artikal(360, "Mix nar, spanac, jabuka", "/pica/mix nesto.jpg", sastojci, "sok1");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button_10.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/mix nesto.jpg")));
		button_10.setBounds(418, 392, 108, 113);
		contentPane.add(button_10);

		JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
			
				
				Artikal a = new Artikal(300, "Mix sargarepa, pomorandza, limun ", "/pica/mix sargarepa limun pomorandza.jpg", sastojci, "sok1");
				GUIKontroler.prikaziPotvrdiPorudzbinuPicaDijalog(a);
			}
		});
		button_11.setIcon(new ImageIcon(PicaProzor.class.getResource("/pica/mix sargarepa limun pomorandza.jpg")));
		button_11.setBounds(418, 267, 108, 113);
		contentPane.add(button_11);
	}
}

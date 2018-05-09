package restoran.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import artikal.Artikal;
import restoran.gui.kontroler.GUIKontroler;
import java.awt.Toolkit;

public class PicaProzorHappyHour extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public PicaProzorHappyHour() {
		setTitle("Happy Hour");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PicaProzorHappyHour.class.getResource("/logo/logo.jpeg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 566, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		button.setIcon(new ImageIcon(PicaProzorHappyHour.class.getResource("/pica/domaca kafa.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Mleko");
				sastojci.add("Stevia");
				
				Artikal a = new Artikal(216, "Domaca kafa", "/pica/domaca kafa.PNG", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuHappyHourPicaDijalog(a);
			}
		});
		button.setBounds(155, 57, 108, 52);
		contentPane.add(button);

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(PicaProzorHappyHour.class.getResource("/pica/makijato.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Sojino mleko");
				sastojci.add("Stevia");
				
				Artikal a = new Artikal(234, "Macchiato", "/pica/makijato.png", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuHappyHourPicaDijalog(a);
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
				
				Artikal a = new Artikal(216, "Mocha", "/pica/moka.png", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuHappyHourPicaDijalog(a);

			}
		});
		button_2.setIcon(new ImageIcon(PicaProzorHappyHour.class.getResource("/pica/moka.png")));
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
				
				Artikal a = new Artikal(216, "Espresso", "/pica/esspreso.jpg", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuHappyHourPicaDijalog(a);
			}
		});
		button_3.setIcon(new ImageIcon(PicaProzorHappyHour.class.getResource("/pica/esspreso.jpg")));
		button_3.setBounds(155, 164, 108, 52);
		contentPane.add(button_3);

		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> sastojci = new LinkedList<String>();
				sastojci.add("Sojino mleko");
				sastojci.add("Stevia");
				
				Artikal a = new Artikal(243, "Ice coffee", "/pica/icecaffe.jpg", sastojci, "kaf");
				GUIKontroler.prikaziPotvrdiPorudzbinuHappyHourPicaDijalog(a);
				
			}
		});
		button_5.setIcon(new ImageIcon(PicaProzorHappyHour.class.getResource("/pica/icecaffe.jpg")));
		button_5.setBounds(418, 57, 108, 122);
		contentPane.add(button_5);

		JLabel lblpiletinaUSosu = new JLabel("Ice coffee");
		lblpiletinaUSosu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpiletinaUSosu.setBounds(418, 6, 127, 45);
		contentPane.add(lblpiletinaUSosu);

		
	}
	}

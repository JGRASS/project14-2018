package restoran.gui;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import artikal.Artikal;
import restoran.gui.kontroler.GUIKontroler;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class GlavniProzor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton button;
	private JButton button_1;
	private JLabel lblPoruceno;
	public static JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnRacun;
	private JLabel lblPomo;
	private JLabel lblSpecijalitetDana;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblCenaDinara;
	private JLabel lblHappyHour;
	private JButton btnNewButton_1;
	private JLabel lblOdDo;
	private JLabel lblVrstaPivaSniena;
	private JLabel lblHrana;
	private JLabel lblPice;
	private JButton btnPoruci;
	
	public static String porudzbina;

	/**
	 * Create the frame.
	 */
	public GlavniProzor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GlavniProzor.class.getResource("/logo/logo.jpeg")));
		setTitle("Restoran");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ugasiAplikaciju();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 603, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTabbedPane(), BorderLayout.CENTER);
	}

	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.addTab("Pocetna strana", null, getPanel(), null);
			tabbedPane.addTab("Meni", null, getPanel_1(), null);
			tabbedPane.addTab("Moje porudzbine", null, getPanel_2(), null);
			tabbedPane.addTab("Pomoc", null, getPanel_3(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getBtnNewButton_1());
			panel.add(getLblSpecijalitetDana());
			panel.add(getBtnSpecijalitet());
			panel.add(getLblNewLabel());
			panel.add(getLblCenaDinara());
			panel.add(getLblHappyHour());
			panel.add(getLblOdDo());
			panel.add(getLblVrstaPivaSniena());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getButton());
			panel_1.add(getButton_1());
			panel_1.add(getLblHrana());
			panel_1.add(getLblPice());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getLblPoruceno());
			panel_2.add(getScrollPane());
			panel_2.add(getButton_2_1());
			panel_2.add(getBtnPoruci());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_3.add(getLblPomo());
			
			JTextArea txtrDobrodoliUQuick = new JTextArea();
			txtrDobrodoliUQuick.setEditable(false);
			txtrDobrodoliUQuick.setFont(new Font("Arial Black", Font.PLAIN, 15));
			txtrDobrodoliUQuick.setText("Dobrodo\u0161li u Quick Serve! \r\nOva aplikacija Vam poma\u017Ee\r\npri odabiru hrane i pi\u0107a\r\ni omogu\u0107ava brzo i jednostavno poru\u010Divanje.\r\nSamo izaberite \u0161ta \u017Eelite, izmenite sastojke ukoliko\r\n\u017Eelite i kliknite poru\u010Di. Nakon \u0161to zavr\u0161ite imate\r\nodmah uvid u Va\u0161 ra\u010Dun i jednim klikom mo\u017Eete\r\npozvati konobara da platite. Takodje u svakom\r\ntrenutku mo\u017Eete pozvati konobara ako Vam je\r\npotrebna dodatna pomo\u0107, klikom na dugme\r\n \"pozovi konobara\".\r\nHvala Vam na poverenju i prijatno!\r\n\r\n");
			txtrDobrodoliUQuick.setBounds(31, 70, 428, 297);
			panel_3.add(txtrDobrodoliUQuick);
			
			JButton btnPozoviKonobara = new JButton("Pozovi konobara");
			btnPozoviKonobara.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//prikaz konobarevog prozora
				}
			});
			btnPozoviKonobara.setFont(new Font("BalloonExtra", Font.PLAIN, 11));
			btnPozoviKonobara.setIcon(new ImageIcon(GlavniProzor.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
			btnPozoviKonobara.setBounds(398, 389, 164, 43);
			panel_3.add(btnPozoviKonobara);
		}
		return panel_3;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Hrana");
			button.setIcon(new ImageIcon(GlavniProzor.class.getResource("/hrana/hrana.jpg")));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.prikaziHranaProzor();
					
				}
			});
			button.setBounds(85, 80, 408, 138);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Pice");
			button_1.setIcon(new ImageIcon(GlavniProzor.class.getResource("/pica/pice.jpg")));
			button_1.setIconTextGap(1);
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//prikaz pica prozor
				}
			});
			button_1.setBounds(85, 291, 408, 138);
		}
		return button_1;
	}
	private JLabel getLblPoruceno() {
		if (lblPoruceno == null) {
			lblPoruceno = new JLabel("Poruceno:\r\n");
			lblPoruceno.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblPoruceno.setBounds(25, 13, 135, 32);
		}
		return lblPoruceno;
	}

	public  JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(25, 88, 278, 197);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	
	private JButton getButton_2_1() {
		if (btnRacun == null) {
			btnRacun = new JButton("RACUN");
			btnRacun.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//ispis racuna i prikaz kod konobara
				}
			});
			btnRacun.setBounds(403, 194, 105, 58);
		}
		return btnRacun;
	}
	private void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(contentPane, "Da li zaista zelite da izadjete iz apliacije",
				"Izlazak", JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	private JLabel getLblPomo() {
		if (lblPomo == null) {
			lblPomo = new JLabel("Pomoc");
			lblPomo.setFont(new Font("BalloonExtra", Font.BOLD, 25));
			lblPomo.setBounds(31, 11, 135, 24);
		}
		return lblPomo;
	}
	private JLabel getLblSpecijalitetDana() {
		if (lblSpecijalitetDana == null) {
			lblSpecijalitetDana = new JLabel("Specijalitet dana");
			lblSpecijalitetDana.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblSpecijalitetDana.setBounds(57, 61, 192, 29);
		}
		return lblSpecijalitetDana;
	}
	
	private JButton getBtnSpecijalitet() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon(GlavniProzor.class.getResource("/hrana/Patsa sa piletinom i pestom.jpg")));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LinkedList<String> sastojci = new LinkedList<String>();
					sastojci.add("Taljatele");
					sastojci.add("Pene");
					sastojci.add("Spagete");
					Artikal a = new Artikal(640, "Pasta sa piletinom i pesto sosom",
							"/hrana/Patsa sa piletinom i pestom.JPG", sastojci, "pa");
					//dijalog za potvrdu
					
				}
			});
			
			getBtnSpecijalitet().setBounds(57, 131, 143, 144);
			//btnNewButton.setBounds(88, 72, 207, 76);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Pasta sa piletinom i pesto sosom");
			lblNewLabel.setBounds(57, 286, 214, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblCenaDinara() {
		if (lblCenaDinara == null) {
			lblCenaDinara = new JLabel("Cena: 640 dinara");
			lblCenaDinara.setFont(new Font("Tahoma", Font.ITALIC, 11));
			lblCenaDinara.setBounds(57, 300, 93, 14);
		}
		return lblCenaDinara;
	}
	private JLabel getLblHappyHour() {
		if (lblHappyHour == null) {
			lblHappyHour = new JLabel("Happy hour");
			lblHappyHour.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblHappyHour.setBounds(347, 58, 157, 34);
		}
		return lblHappyHour;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setIcon(new ImageIcon(GlavniProzor.class.getResource("/pica/kafa.jpg")));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// prozor pica happy hour
				}
			});
			btnNewButton_1.setBounds(347, 131, 143, 144);
		}
		return btnNewButton_1;
	}
	private JLabel getLblOdDo() {
		if (lblOdDo == null) {
			lblOdDo = new JLabel("Od 10:00 do 11:00 cene\r\n svih ");
			lblOdDo.setBounds(347, 282, 178, 23);
		}
		return lblOdDo;
	}
	private JLabel getLblVrstaPivaSniena() {
		if (lblVrstaPivaSniena == null) {
			lblVrstaPivaSniena = new JLabel("vrsta kafa sni\u017Eene za 10%");
			lblVrstaPivaSniena.setBounds(347, 300, 157, 14);
		}
		return lblVrstaPivaSniena;
	}
	private JLabel getLblHrana() {
		if (lblHrana == null) {
			lblHrana = new JLabel("Hrana");
			lblHrana.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblHrana.setBounds(250, 44, 63, 35);
		}
		return lblHrana;
	}
	private JLabel getLblPice() {
		if (lblPice == null) {
			lblPice = new JLabel("Pice");
			lblPice.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPice.setBounds(250, 257, 123, 35);
		}
		return lblPice;
	}
	private JButton getBtnPoruci() {
		if (btnPoruci == null) {
			btnPoruci = new JButton("PORUCI");
			btnPoruci.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//prikazi konobar i ispisi tamo
					
				}
			});
			btnPoruci.setBounds(403, 106, 105, 58);
		}
		return btnPoruci;
	}
}

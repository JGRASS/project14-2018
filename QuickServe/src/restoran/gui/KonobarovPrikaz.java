package restoran.gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class KonobarovPrikaz extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JButton btnSto;
	private JButton btnSto_1;
	private JButton btnSto_2;
	private JButton btnSto_3;
	private JLabel lblUkupanRacun;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	public static JTextArea textAreaSto;
	private JScrollPane scrollPane;
	public static JLabel labelRacun;



	/**
	 * Create the frame.
	 */
	public KonobarovPrikaz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(KonobarovPrikaz.class.getResource("/logo/logo.jpeg")));
		setTitle("Konobar");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 652, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnSto());
		contentPane.add(getBtnSto_1());
		contentPane.add(getBtnSto_2());
		contentPane.add(getBtnSto_3());
		contentPane.add(getLblUkupanRacun());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getScrollPane());
		contentPane.add(getLabelRacun());
	}
	private JButton getBtnSto() {
		if (btnSto == null) {
			btnSto = new JButton("Sto 1");
			btnSto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// pritisak na dugme sto 1
					
				}
			});
			btnSto.setBounds(12, 26, 178, 111);
		}
		return btnSto;
	}
	private JButton getBtnSto_1() {
		if (btnSto_1 == null) {
			btnSto_1 = new JButton("Sto 2");
			btnSto_1.setBounds(332, 26, 178, 111);
		}
		return btnSto_1;
	}
	private JButton getBtnSto_2() {
		if (btnSto_2 == null) {
			btnSto_2 = new JButton("Sto 3");
			btnSto_2.setBounds(12, 192, 178, 111);
		}
		return btnSto_2;
	}
	private JButton getBtnSto_3() {
		if (btnSto_3 == null) {
			btnSto_3 = new JButton("Sto 4");
			btnSto_3.setBounds(332, 192, 178, 111);
		}
		return btnSto_3;
	}
	private JLabel getLblUkupanRacun() {
		if (lblUkupanRacun == null) {
			lblUkupanRacun = new JLabel("Ukupan racun:");
			lblUkupanRacun.setBounds(22, 146, 107, 16);
		}
		return lblUkupanRacun;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Ukupan racun:");
			label.setBounds(342, 146, 130, 16);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Ukupan racun:");
			label_1.setBounds(342, 316, 130, 16);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Ukupan racun:");
			label_2.setBounds(22, 316, 130, 16);
		}
		return label_2;
	}
	private JTextArea getTextAreaSto() {
		if (textAreaSto == null) {
			textAreaSto = new JTextArea();
		}
		return textAreaSto;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 375, 476, 127);
			scrollPane.setViewportView(getTextAreaSto());
		}
		return scrollPane;
	}
	private JLabel getLabelRacun() {
		if (labelRacun == null) {
			labelRacun = new JLabel("");
			labelRacun.setBounds(126, 148, 64, 16);
		}
		return labelRacun;
	}
}

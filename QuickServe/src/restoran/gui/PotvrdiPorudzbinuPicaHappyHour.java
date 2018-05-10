package restoran.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import artikal.Artikal;
import restoran.gui.kontroler.GUIKontroler;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class PotvrdiPorudzbinuPicaHappyHour extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private LinkedList<String> izabraniSastojci = new LinkedList<String>();

	/**
	 * Create the dialog.
	 */
	public PotvrdiPorudzbinuPicaHappyHour(Artikal a) {
		setTitle("Potvrda happy hour");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PotvrdiPorudzbinuPicaHappyHour.class.getResource("/logo/logo.jpeg")));
		
		setBounds(100, 100, 611, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblBiftek = new JLabel(a.naziv);
			lblBiftek.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblBiftek.setBounds(22, 13, 284, 38);
			contentPanel.add(lblBiftek);
		}
		{
			JLabel lblSlika = new JLabel(a.naziv);
			lblSlika.setIcon(a.image);

			lblSlika.setSize(150, 100);
			lblSlika.setBounds(34, 62, 196, 185);
			lblSlika.setText(null);
			contentPanel.add(lblSlika);
		}
		{
			if (a.sastojci.size() >= 1) {
				JCheckBox box1 = new JCheckBox(a.sastojci.get(0));
				box1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (box1.isSelected()) {
							izabraniSastojci.add(a.sastojci.get(0));
						}
					}
				});
				box1.setBounds(318, 85, 194, 25);
				contentPanel.add(box1);
			}
		}
		{
			if (a.sastojci.size() >= 2) {
				JCheckBox box2 = new JCheckBox(a.sastojci.get(1));
				box2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (box2.isSelected()) {
							izabraniSastojci.add(a.sastojci.get(1));
						}
					}
					
				});
				box2.setBounds(318, 115, 220, 25);
				contentPanel.add(box2);
			}
		}
		{
			if (a.sastojci.size() >= 3) {
				JCheckBox box3 = new JCheckBox(a.sastojci.get(2));
				box3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (box3.isSelected()) {
							izabraniSastojci.add(a.sastojci.get(2));
						}
					}
				});
				box3.setBounds(318, 145, 255, 25);
				contentPanel.add(box3);
			}
		}
			JLabel lblNewLabel = new JLabel("Izaberite dodatak: ");
			if (a.tip.equals("sok1")) {
				lblNewLabel.setEnabled(false);
			}
			
			
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(320, 44, 218, 30);
			contentPanel.add(lblNewLabel);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("Poruci");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							GUIKontroler.poruci(a, izabraniSastojci);
							dispose();
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Otkazi");
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							dispose();
						}
					});
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
		}
	}

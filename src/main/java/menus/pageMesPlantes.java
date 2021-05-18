package menus;

import javax.swing.JFrame;

import meteo.valeurs;
import metier.Compte;
import util.Context;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import app.App;

public class pageMesPlantes {

	private static JFrame jf;
	//""+meteo.valeurs.a.get(0)


	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame genererPageMesPlantes() {

		valeurs.main(App.compte);

		jf = new JFrame("Mes Plantes avec Thousand Sunny's Little Garden");
		jf.getContentPane().setLayout(null);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pageParametres.genererPageParametres();
			}
		});
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBounds(365, 11, 50, 49);
		btnNewButton_3.setIcon(new ImageIcon(pageAjouterPlante.class.getResource("/images/rouage40x40.png")));
		jf.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("MES PLANTES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setBounds(71, 26, 312, 67);
		jf.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("RETOUR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				pageHomeGarden.genererPageHomeGarden();
			}
		});
		
		btnNewButton.setFont(new Font("Goudy Old Style", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(72, 61, 139));
		btnNewButton.setBounds(10, 26, 89, 23);
		jf.getContentPane().add(btnNewButton);
		
		JPanel AjoutPlante = new JPanel();
		AjoutPlante.setBounds(21, 145, 156, 200);
		jf.getContentPane().add(AjoutPlante);
		AjoutPlante.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Ajouter une plante");
		lblNewLabel_8.setFont(new Font("Goudy Old Style", Font.BOLD, 18));
		lblNewLabel_8.setForeground(new Color(138, 43, 226));
		lblNewLabel_8.setBounds(26, 177, 130, 23);
		AjoutPlante.add(lblNewLabel_8);
		
		JButton btnNewButton_1 = new JButton("AJOUTER DES PLANTES");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				pageAjouterPlante.ajouterPlante();
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBackground(new Color(173, 255, 47));
		btnNewButton_1.setBounds(0, 0, 156, 200);
		btnNewButton_1.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/plantmain2.png")));
		AjoutPlante.add(btnNewButton_1);
		
		JPanel Statsg = new JPanel();
		Statsg.setBorder(new TitledBorder(null, "STATS DE MON POTAGER", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(119, 136, 153)));
		Statsg.setBackground(new Color(152, 251, 152));
		Statsg.setBounds(202, 145, 194, 200);
		jf.getContentPane().add(Statsg);
		Statsg.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nb plantations");
		lblNewLabel_1.setBounds(10, 26, 83, 14);
		Statsg.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nb d'esp\u00E8ces");
		lblNewLabel_2.setBounds(10, 53, 83, 14);
		Statsg.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(""+ (Context.get_instance().getDaoMP().findAllByUser(App.compte.getId())).size());
		lblNewLabel_3.setBounds(143, 26, 63, 14);
		Statsg.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(""+ (Context.get_instance().getDaoMP().findAllSpeciesByUser(App.compte.getId())).size());
		lblNewLabel_4.setBounds(143, 53, 63, 14);
		Statsg.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total plantations");
		lblNewLabel_5.setBounds(10, 78, 83, 14);
		Statsg.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Plants \u00E9chou\u00E9s");
		lblNewLabel_6.setBounds(10, 103, 123, 14);
		Statsg.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4_1 = new JLabel(""+ (Context.get_instance().getDaoMP().findAllByUser(App.compte.getId())).size());
		lblNewLabel_4_1.setBounds(143, 78, 63, 14);
		Statsg.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("A venir");
		lblNewLabel_4_2.setBounds(143, 103, 63, 14);
		Statsg.add(lblNewLabel_4_2);
		
		JPanel ConsulterPlantes = new JPanel();
		ConsulterPlantes.setBounds(21, 407, 375, 200);
		jf.getContentPane().add(ConsulterPlantes);
		ConsulterPlantes.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("CONSULTER MES PLANTES");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(255, 222, 173));
		lblNewLabel_7.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
		lblNewLabel_7.setBounds(34, 0, 318, 57);
		ConsulterPlantes.add(lblNewLabel_7);
		
		JButton btnNewButton_2 = new JButton("CONSULTER MON POTAGER");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBounds(10, 0, 365, 200);
		btnNewButton_2.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/consulterpotage375x234.jpg")));
		ConsulterPlantes.add(btnNewButton_2);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 700);
		jf.setVisible(true);
		return jf;
	}	}


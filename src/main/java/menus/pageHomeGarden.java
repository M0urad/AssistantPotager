package menus;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import app.App;
import meteo.valeurs;
import metier.Compte;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class pageHomeGarden {
	
	
	private static JFrame jf;
	//""+meteo.valeurs.a.get(0)


	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame genererPageHomeGarden() {
		
		valeurs.main(App.compte);

		jf = new JFrame("Thousand Sunny's Garden");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 700);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pageParametres.genererPageParametres();
			}
		});
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBounds(365, 11, 50, 49);
		btnNewButton_3.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/rouage40x40.png")));
		jf.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				pageMesPlantes.genererPageMesPlantes();
			}
		});
		
		
		btnNewButton_1.setBounds(2, 188, 433, 109);
		btnNewButton_1.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/potager400x100.jpg")));
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBounds(2, 304, 433, 109);
		btnNewButton_1_1.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/recettes400x101.jpg")));
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.setBounds(2, 424, 433, 109);
		btnNewButton_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1_1.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/news400x101jpg.jpg")));
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1_1.setBounds(2, 554, 433, 109);
		btnNewButton_1_1_1_1.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/arene400x101.jpg")));
		btnNewButton_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		jf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(""+(int)(meteo.valeurs.a.get(3).value-273.15)+"?");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		lblNewLabel.setBounds(140, 132, 73, 39);
		jf.getContentPane().add(lblNewLabel);
		
		JLabel lblMesPlantes_1_1_1_1 = new JLabel("Garden Melee Arena");
		lblMesPlantes_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesPlantes_1_1_1_1.setForeground(Color.BLACK);
		lblMesPlantes_1_1_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		lblMesPlantes_1_1_1_1.setBounds(84, 560, 242, 25);
		jf.getContentPane().add(lblMesPlantes_1_1_1_1);
		
		JLabel lblMesPlantes_1_1_1 = new JLabel("News & Tutoriels");
		lblMesPlantes_1_1_1.setOpaque(true);
		lblMesPlantes_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesPlantes_1_1_1.setForeground(new Color(0, 0, 0));
		lblMesPlantes_1_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		lblMesPlantes_1_1_1.setBounds(116, 497, 176, 25);
		jf.getContentPane().add(lblMesPlantes_1_1_1);
		
		JLabel lblMesPlantes_1_2 = new JLabel("Meteo");
		lblMesPlantes_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesPlantes_1_2.setForeground(Color.WHITE);
		lblMesPlantes_1_2.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		lblMesPlantes_1_2.setBounds(25, 80, 92, 25);
		jf.getContentPane().add(lblMesPlantes_1_2);
		
		JLabel lblMesPlantes_1_1 = new JLabel("Mes recettes");
		lblMesPlantes_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesPlantes_1_1.setForeground(Color.WHITE);
		lblMesPlantes_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		lblMesPlantes_1_1.setBounds(25, 341, 133, 25);
		jf.getContentPane().add(lblMesPlantes_1_1);
		
		JLabel lblMesPlantes_1 = new JLabel("Mes plantes");
		lblMesPlantes_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesPlantes_1.setForeground(new Color(255, 255, 255));
		lblMesPlantes_1.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		lblMesPlantes_1.setBounds(10, 204, 133, 25);
		jf.getContentPane().add(lblMesPlantes_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				pageMeteo.genererPageMeteo();
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(2, 62, 433, 109);
		btnNewButton.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/meteo400x101.jpg")));
		jf.getContentPane().add(btnNewButton);
		jf.getContentPane().add(btnNewButton_1);
		jf.getContentPane().add(btnNewButton_1_1);
		jf.getContentPane().add(btnNewButton_1_1_1);
		jf.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setOpaque(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				pageSeConnecter.seConnecter(App.comptes);
			}
		});
		
		btnNewButton_2.setBounds(10, 11, 80, 40);
		btnNewButton_2.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/retour40x40.png")));
		jf.getContentPane().add(btnNewButton_2);

		
		
		jf.setVisible(true);
	
		return jf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
}

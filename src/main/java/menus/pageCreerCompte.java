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
import javax.swing.border.BevelBorder;

import app.App;
import dao.DAOCompte;
//import main.App;
import meteo.valeurs;
import metier.Compte;
import util.Context;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class pageCreerCompte{
	
	
	private static JFrame jf;
	private static JTextField textField1;
	private static JTextField textField2;
	private static JTextField textField3;
	private static JTextField textField4;
	private static JTextField textField5;
	private static JTextField textField6;
	private static Compte compte;
	
	//""+meteo.valeurs.a.get(0)


	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame creerCompte() {

		jf = new JFrame("Thousand Sunny's Little Garden");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 700);
		jf.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Creer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				compte=new Compte(textField1.getText(),textField2.getText(),textField4.getText(),textField5.getText(),textField6.getText(),textField3.getText());
				App.compte=Context.get_instance().getDaoC().save(compte);
				pageHomeGarden.genererPageHomeGarden(compte);
				
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setIconTextGap(3);
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(245, 222, 179), new Color(47, 79, 79), new Color(47, 79, 79), new Color(255, 222, 173)));
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBounds(161, 485, 110, 40);
		jf.getContentPane().add(btnNewButton);
		
		textField6 = new JTextField();
		textField6.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField6.setColumns(10);
		textField6.setBounds(160, 439, 110, 28);
		jf.getContentPane().add(textField6);
		
		textField5 = new JTextField();
		textField5.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField5.setColumns(10);
		textField5.setBounds(160, 409, 110, 28);
		jf.getContentPane().add(textField5);
		
		textField4 = new JTextField();
		textField4.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField4.setColumns(10);
		textField4.setBounds(160, 379, 110, 28);
		jf.getContentPane().add(textField4);
		
		textField3 = new JTextField();
		textField3.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField3.setColumns(10);
		textField3.setBounds(160, 349, 110, 28);
		jf.getContentPane().add(textField3);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField2.setColumns(10);
		textField2.setBounds(160, 319, 110, 28);
		jf.getContentPane().add(textField2);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField1.setBounds(160, 290, 110, 28);
		jf.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel6 = new JLabel("Pays :");
		lblNewLabel6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel6.setForeground(Color.WHITE);
		lblNewLabel6.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNewLabel6.setBounds(95, 440, 50, 30);
		jf.getContentPane().add(lblNewLabel6);
		
		JLabel lblNewLabel5 = new JLabel("Code postal :");
		lblNewLabel5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel5.setForeground(Color.WHITE);
		lblNewLabel5.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNewLabel5.setBounds(40, 409, 110, 30);
		jf.getContentPane().add(lblNewLabel5);
		
		JLabel lblNewLabel4 = new JLabel("Ville :");
		lblNewLabel4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel4.setForeground(Color.WHITE);
		lblNewLabel4.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNewLabel4.setBounds(93, 379, 48, 30);
		jf.getContentPane().add(lblNewLabel4);
		
		JLabel lblNewLabel3 = new JLabel("Adresse mail :");
		lblNewLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel3.setForeground(Color.WHITE);
		lblNewLabel3.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNewLabel3.setBounds(33, 349, 110, 30);
		jf.getContentPane().add(lblNewLabel3);
		
		JLabel lblNewLabel2 = new JLabel("Mot de passe :");
		lblNewLabel2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel2.setForeground(Color.WHITE);
		lblNewLabel2.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNewLabel2.setBounds(33, 318, 110, 30);
		jf.getContentPane().add(lblNewLabel2);
		
		JLabel lblNewLabel1 = new JLabel("Identifiant :");
		lblNewLabel1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel1.setForeground(Color.WHITE);
		lblNewLabel1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNewLabel1.setBounds(50, 288, 110, 30);
		jf.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel = new JLabel("Cr\u00E9ation de compte");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(76, 31, 285, 52);
		jf.getContentPane().add(lblNewLabel);
		
		JLabel lblImages = new JLabel("");
		lblImages.setHorizontalAlignment(SwingConstants.CENTER);
		lblImages.setForeground(new Color(255, 255, 255));
		lblImages.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		lblImages.setIcon(new ImageIcon(pageCreerCompte.class.getResource("/images/TSLG700x450.jpg")));
		lblImages.setBounds(0, 0, 436, 664);
		jf.getContentPane().add(lblImages);
		
		
		jf.setVisible(true);
	
		return jf;
	}

	public static void main(String[] args) {
		creerCompte();

	}
}

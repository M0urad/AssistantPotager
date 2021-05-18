package menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import app.App;
import plante.MaPlante;
import plante.Plante;
import util.Context;

public class pageConsulterMesPlantes {
	
	public static JFrame jf;
	public static JTextField textField;
	public static JTextField textField2;
	public static int j=0;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void genererPageConsulterMesPlantes () {
		
		j=0;

		jf = new JFrame("Thounsand Sunny's Little Garden");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 700);
		jf.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Ajouter \u00E0 mes plantes");
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				pageMesPlantes.genererPageMesPlantes();
			}
		});
		btnNewButton_1.setBounds(0, 10, 85, 21);
		jf.getContentPane().add(btnNewButton_1);
		btnNewButton.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setBounds(20, 565, 400, 40);
		jf.getContentPane().add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(20, 60, 400, 480);
		jf.getContentPane().add(panel);
		panel.setLayout(null);
		
		for (MaPlante plante : App.mesPlantes) {
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(plante.getSurnom());
			rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
			rdbtnNewRadioButton_1.setBackground(new Color(34, 139, 34));
			rdbtnNewRadioButton_1.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
			rdbtnNewRadioButton_1.setBounds(6, 34+j, 100, 21);
			panel.add(rdbtnNewRadioButton_1);

			JLabel lblNewLabel1 = new JLabel("Nom");
			lblNewLabel1.setForeground(new Color(255, 255, 255));
			lblNewLabel1.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
			lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel1.setBackground(new Color(34, 139, 34));
			lblNewLabel1.setOpaque(true);
			lblNewLabel1.setBounds(110, 33+j, 50, 23);
			panel.add(lblNewLabel1);

			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(170, 35+j, 65, 19);
			panel.add(textField);
			
			JLabel lblNewLabel2 = new JLabel("Date");
			lblNewLabel2.setForeground(new Color(255, 255, 255));
			lblNewLabel2.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
			lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel2.setBackground(new Color(34, 139, 34));
			lblNewLabel2.setOpaque(true);
			lblNewLabel2.setBounds(245, 33+j, 50, 23);
			panel.add(lblNewLabel2);

			textField2 = new JTextField();
			textField2.setColumns(10);
			textField2.setBounds(305, 35+j, 65, 19);
			panel.add(textField2);
			
			j=j+28;
			
		}
		

		JLabel lblImages = new JLabel("");
		lblImages.setHorizontalAlignment(SwingConstants.CENTER);
		lblImages.setForeground(new Color(255, 255, 255));
		lblImages.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		lblImages.setIcon(new ImageIcon(pageCreerCompte.class.getResource("/images/MesPlantes450x700.png")));
		lblImages.setBounds(0, 0, 436, 664);
		jf.getContentPane().add(lblImages);
		
		jf.setVisible(true);

		
	}
	
	public static void main (String[] args) {
		
	}

}

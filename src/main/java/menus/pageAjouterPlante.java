package menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import app.App;
import metier.Compte;
import plante.Basilic;
import plante.MaPlante;
import plante.Plante;
import util.Context;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.AbstractListModel;

public class pageAjouterPlante {

	public static JFrame jf;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JTextField textField_12;
	private static JTextField textField_13;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame ajouterPlante(Compte compte) {


		jf = new JFrame("Thounsand Sunny's Little Garden");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 700);
		jf.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Ajouter \u00E0 mes plantes");
		btnNewButton.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setBounds(20, 565, 400, 40);
		jf.getContentPane().add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(20, 60, 400, 480);
		jf.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(199, 5, 68, 23);
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(277, 7, 96, 19);
		panel.add(textField);
		textField.setColumns(10);


		JRadioButton rdbtnNewRadioButton = new JRadioButton("Basilic");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(int i=0; i<Integer.parseInt(textField.getText()); i++) {
					Basilic basilic=new Basilic();
					MaPlante basil = new MaPlante(null,null,basilic,compte);
					Context.get_instance().getDaoMP().add(basil);
					App.mesPlantes.add(basil);
				}

			}
		});
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(6, 6, 187, 21);
		panel.add(rdbtnNewRadioButton);

		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(383, 0, 17, 480);
		panel.add(scrollBar_1);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Blette");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_1.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(6, 34, 187, 21);
		panel.add(rdbtnNewRadioButton_1);

		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setBounds(199, 33, 68, 23);
		panel.add(lblNewLabel_1_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(277, 35, 96, 19);
		panel.add(textField_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Carotte");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_2.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_2.setBounds(6, 62, 187, 21);
		panel.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_1_2 = new JLabel("Nombre");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setBounds(199, 61, 68, 23);
		panel.add(lblNewLabel_1_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(277, 63, 96, 19);
		panel.add(textField_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Courgette");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_3.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_3.setBounds(6, 90, 187, 21);
		panel.add(rdbtnNewRadioButton_3);

		JLabel lblNewLabel_1_3 = new JLabel("Nombre");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setBounds(199, 89, 68, 23);
		panel.add(lblNewLabel_1_3);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(277, 91, 96, 19);
		panel.add(textField_3);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Menthe");
		rdbtnNewRadioButton_4.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_4.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_4.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_4.setBounds(6, 118, 187, 21);
		panel.add(rdbtnNewRadioButton_4);

		JLabel lblNewLabel_1_4 = new JLabel("Nombre");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setBounds(199, 117, 68, 23);
		panel.add(lblNewLabel_1_4);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(277, 119, 96, 19);
		panel.add(textField_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Past\u00E8que");
		rdbtnNewRadioButton_5.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_5.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_5.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_5.setBounds(6, 146, 187, 21);
		panel.add(rdbtnNewRadioButton_5);

		JLabel lblNewLabel_1_5 = new JLabel("Nombre");
		lblNewLabel_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_5.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_5.setOpaque(true);
		lblNewLabel_1_5.setBounds(199, 145, 68, 23);
		panel.add(lblNewLabel_1_5);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(277, 147, 96, 19);
		panel.add(textField_5);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Persil");
		rdbtnNewRadioButton_6.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_6.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_6.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_6.setBounds(6, 174, 187, 21);
		panel.add(rdbtnNewRadioButton_6);

		JLabel lblNewLabel_1_6 = new JLabel("Nombre");
		lblNewLabel_1_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_6.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_6.setOpaque(true);
		lblNewLabel_1_6.setBounds(199, 173, 68, 23);
		panel.add(lblNewLabel_1_6);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(277, 175, 96, 19);
		panel.add(textField_6);

		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Poireau");
		rdbtnNewRadioButton_7.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_7.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_7.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_7.setBounds(6, 202, 187, 21);
		panel.add(rdbtnNewRadioButton_7);

		JLabel lblNewLabel_1_7 = new JLabel("Nombre");
		lblNewLabel_1_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_7.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_7.setOpaque(true);
		lblNewLabel_1_7.setBounds(199, 201, 68, 23);
		panel.add(lblNewLabel_1_7);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(277, 203, 96, 19);
		panel.add(textField_7);

		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Poivron");
		rdbtnNewRadioButton_8.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_8.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_8.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_8.setBounds(6, 230, 187, 21);
		panel.add(rdbtnNewRadioButton_8);

		JLabel lblNewLabel_1_8 = new JLabel("Nombre");
		lblNewLabel_1_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_8.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_8.setOpaque(true);
		lblNewLabel_1_8.setBounds(199, 229, 68, 23);
		panel.add(lblNewLabel_1_8);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(277, 231, 96, 19);
		panel.add(textField_8);

		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Pomme de la Terre");
		rdbtnNewRadioButton_9.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_9.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_9.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_9.setBounds(6, 258, 187, 21);
		panel.add(rdbtnNewRadioButton_9);

		JLabel lblNewLabel_1_9 = new JLabel("Nombre");
		lblNewLabel_1_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_9.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_9.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_9.setOpaque(true);
		lblNewLabel_1_9.setBounds(199, 257, 68, 23);
		panel.add(lblNewLabel_1_9);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(277, 259, 96, 19);
		panel.add(textField_9);

		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Potiron");
		rdbtnNewRadioButton_10.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_10.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_10.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_10.setBounds(6, 286, 187, 21);
		panel.add(rdbtnNewRadioButton_10);

		JLabel lblNewLabel_1_10 = new JLabel("Nombre");
		lblNewLabel_1_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_10.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_10.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_10.setOpaque(true);
		lblNewLabel_1_10.setBounds(199, 285, 68, 23);
		panel.add(lblNewLabel_1_10);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(277, 287, 96, 19);
		panel.add(textField_10);

		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Radis");
		rdbtnNewRadioButton_11.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_11.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_11.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_11.setBounds(6, 314, 187, 21);
		panel.add(rdbtnNewRadioButton_11);

		JLabel lblNewLabel_1_11 = new JLabel("Nombre");
		lblNewLabel_1_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_11.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_11.setOpaque(true);
		lblNewLabel_1_11.setBounds(199, 313, 68, 23);
		panel.add(lblNewLabel_1_11);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(277, 315, 96, 19);
		panel.add(textField_11);

		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Salade");
		rdbtnNewRadioButton_12.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_12.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_12.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_12.setBounds(6, 342, 187, 21);
		panel.add(rdbtnNewRadioButton_12);

		JLabel lblNewLabel_1_12 = new JLabel("Nombre");
		lblNewLabel_1_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_12.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_12.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_12.setOpaque(true);
		lblNewLabel_1_12.setBounds(199, 341, 68, 23);
		panel.add(lblNewLabel_1_12);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(277, 343, 96, 19);
		panel.add(textField_12);

		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Tomate");
		rdbtnNewRadioButton_13.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_13.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_13.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_13.setBounds(6, 370, 187, 21);
		panel.add(rdbtnNewRadioButton_13);

		JLabel lblNewLabel_1_13 = new JLabel("Nombre");
		lblNewLabel_1_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_13.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_13.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_13.setOpaque(true);
		lblNewLabel_1_13.setBounds(199, 369, 68, 23);
		panel.add(lblNewLabel_1_13);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(277, 371, 96, 19);
		panel.add(textField_13);

		JLabel lblNewLabel = new JLabel("Ajouter des plantes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(75, 10, 285, 52);
		jf.getContentPane().add(lblNewLabel);

		JLabel lblImages = new JLabel("");
		lblImages.setHorizontalAlignment(SwingConstants.CENTER);
		lblImages.setForeground(new Color(255, 255, 255));
		lblImages.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		lblImages.setIcon(new ImageIcon(pageCreerCompte.class.getResource("/images/MesPlantes450x700.png")));
		lblImages.setBounds(0, 0, 436, 664);
		jf.getContentPane().add(lblImages);


		jf.setVisible(true);

		return jf;
	}

	public static void main(String[] args) {

	}
}

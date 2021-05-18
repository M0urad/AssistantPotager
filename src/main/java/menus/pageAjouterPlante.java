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
import plante.*;
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
	private static JTextField textField_14;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame ajouterPlante() {
		
		


		jf = new JFrame("Thounsand Sunny's Little Garden");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 700);
		jf.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Ajouter \u00E0 mes plantes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!textField.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField.getText()); i++) {
						Plante basilic=Context.get_instance().getDaoP().findById(1);
						MaPlante basil = new MaPlante("basil"+(i+1),null,basilic,App.compte);
						Context.get_instance().getDaoMP().save(basil);
						App.mesPlantes.add(basil);
					}
				}
				if(!textField_1.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_1.getText()); i++) {
						Plante blette=Context.get_instance().getDaoP().findById(2);
						MaPlante blet = new MaPlante("blette"+(i+1),null,blette,App.compte);
						Context.get_instance().getDaoMP().save(blet);
						App.mesPlantes.add(blet);
					}
				}
				if(!textField_2.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_2.getText()); i++) {
						Plante carotte=Context.get_instance().getDaoP().findById(3);
						MaPlante karot = new MaPlante("karot"+(i+1),null,carotte,App.compte);
						Context.get_instance().getDaoMP().save(karot);
						App.mesPlantes.add(karot);
					}
				}
				if(!textField_14.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_14.getText()); i++) {
						Plante coriandre=Context.get_instance().getDaoP().findById(4);
						MaPlante korian = new MaPlante("korian"+(i+1),null,coriandre,App.compte);
						Context.get_instance().getDaoMP().save(korian);
						App.mesPlantes.add(korian);
					}
				}
				if(!textField_3.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_3.getText()); i++) {
						Plante courgette=Context.get_instance().getDaoP().findById(5);
						MaPlante coucou = new MaPlante("coucou"+(i+1),null,courgette,App.compte);
						Context.get_instance().getDaoMP().save(coucou);
						App.mesPlantes.add(coucou);
					}
				}
				if(!textField_4.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_4.getText()); i++) {
						Plante menthe=Context.get_instance().getDaoP().findById(6);
						MaPlante mint = new MaPlante("mint"+(i+1),null,menthe,App.compte);
						Context.get_instance().getDaoMP().save(mint);
						App.mesPlantes.add(mint);
					}
				}
				if(!textField_5.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_5.getText()); i++) {
						Plante pasteque=Context.get_instance().getDaoP().findById(7);
						MaPlante lolo = new MaPlante("lolo"+(i+1),null,pasteque,App.compte);
						Context.get_instance().getDaoMP().save(lolo);
						App.mesPlantes.add(lolo);
					}
				}
				if(!textField_6.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_6.getText()); i++) {
						Plante persil=Context.get_instance().getDaoP().findById(8);
						MaPlante persy = new MaPlante("persy"+(i+1),null,persil,App.compte);
						Context.get_instance().getDaoMP().save(persy);
						App.mesPlantes.add(persy);
					}
				}
				if(!textField_7.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_7.getText()); i++) {
						Plante poireau=Context.get_instance().getDaoP().findById(9);
						MaPlante hercule = new MaPlante("hercule"+(i+1),null,poireau,App.compte);
						Context.get_instance().getDaoMP().save(hercule);
						App.mesPlantes.add(hercule);
					}
				}
				if(!textField_8.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_8.getText()); i++) {
						Plante poivron=Context.get_instance().getDaoP().findById(10);
						MaPlante poivro = new MaPlante("poivro"+(i+1),null,poivron,App.compte);
						Context.get_instance().getDaoMP().save(poivro);
						App.mesPlantes.add(poivro);
					}
				}
				if(!textField_9.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_9.getText()); i++) {
						Plante patate=Context.get_instance().getDaoP().findById(11);
						MaPlante frite = new MaPlante("poivro"+(i+1),null,patate,App.compte);
						Context.get_instance().getDaoMP().save(frite);
						App.mesPlantes.add(frite);
					}
				}
				if(!textField_10.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_10.getText()); i++) {
						Plante potiron=Context.get_instance().getDaoP().findById(12);
						MaPlante potiti = new MaPlante("potiti"+(i+1),null,potiron,App.compte);
						Context.get_instance().getDaoMP().save(potiti);
						App.mesPlantes.add(potiti);
					}
				}
				if(!textField_11.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_11.getText()); i++) {
						Plante radis=Context.get_instance().getDaoP().findById(13);
						MaPlante radin = new MaPlante("radin"+(i+1),null,radis,App.compte);
						Context.get_instance().getDaoMP().save(radin);
						App.mesPlantes.add(radin);
					}
				}
				if(!textField_12.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_12.getText()); i++) {
						Plante salade=Context.get_instance().getDaoP().findById(14);
						MaPlante mytho = new MaPlante("mytho"+(i+1),null,salade,App.compte);
						Context.get_instance().getDaoMP().save(mytho);
						App.mesPlantes.add(mytho);
					}
				}
				if(!textField_13.getText().equals("")) {
					for(int i=0; i<Integer.parseInt(textField_13.getText()); i++) {
						Plante tomate=Context.get_instance().getDaoP().findById(15);
						MaPlante ketchup = new MaPlante("ketchup"+(i+1),null,tomate,App.compte);
						Context.get_instance().getDaoMP().save(ketchup);
						App.mesPlantes.add(ketchup);
					}
				}
				jf.setVisible(false);
				pageMesPlantes.genererPageMesPlantes();

			}
		});

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
		//rdbtnNewRadioButton.setActionCommand("1");
//		rdbtnNewRadioButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				tmp[0]=1;
//
//			}
//		});
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
		rdbtnNewRadioButton_3.setBounds(6, 119, 187, 21);
		panel.add(rdbtnNewRadioButton_3);

		JLabel lblNewLabel_1_3 = new JLabel("Nombre");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setBounds(199, 118, 68, 23);
		panel.add(lblNewLabel_1_3);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(277, 120, 96, 19);
		panel.add(textField_3);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Menthe");
		rdbtnNewRadioButton_4.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_4.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_4.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_4.setBounds(6, 147, 187, 21);
		panel.add(rdbtnNewRadioButton_4);

		JLabel lblNewLabel_1_4 = new JLabel("Nombre");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setBounds(199, 146, 68, 23);
		panel.add(lblNewLabel_1_4);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(277, 148, 96, 19);
		panel.add(textField_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Past\u00E8que");
		rdbtnNewRadioButton_5.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_5.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_5.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_5.setBounds(6, 175, 187, 21);
		panel.add(rdbtnNewRadioButton_5);

		JLabel lblNewLabel_1_5 = new JLabel("Nombre");
		lblNewLabel_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_5.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_5.setOpaque(true);
		lblNewLabel_1_5.setBounds(199, 174, 68, 23);
		panel.add(lblNewLabel_1_5);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(277, 176, 96, 19);
		panel.add(textField_5);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Persil");
		rdbtnNewRadioButton_6.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_6.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_6.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_6.setBounds(6, 203, 187, 21);
		panel.add(rdbtnNewRadioButton_6);

		JLabel lblNewLabel_1_6 = new JLabel("Nombre");
		lblNewLabel_1_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_6.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_6.setOpaque(true);
		lblNewLabel_1_6.setBounds(199, 202, 68, 23);
		panel.add(lblNewLabel_1_6);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(277, 204, 96, 19);
		panel.add(textField_6);

		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Poireau");
		rdbtnNewRadioButton_7.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_7.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_7.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_7.setBounds(6, 231, 187, 21);
		panel.add(rdbtnNewRadioButton_7);

		JLabel lblNewLabel_1_7 = new JLabel("Nombre");
		lblNewLabel_1_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_7.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_7.setOpaque(true);
		lblNewLabel_1_7.setBounds(199, 230, 68, 23);
		panel.add(lblNewLabel_1_7);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(277, 232, 96, 19);
		panel.add(textField_7);

		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Poivron");
		rdbtnNewRadioButton_8.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_8.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_8.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_8.setBounds(6, 259, 187, 21);
		panel.add(rdbtnNewRadioButton_8);

		JLabel lblNewLabel_1_8 = new JLabel("Nombre");
		lblNewLabel_1_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_8.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_8.setOpaque(true);
		lblNewLabel_1_8.setBounds(199, 258, 68, 23);
		panel.add(lblNewLabel_1_8);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(277, 260, 96, 19);
		panel.add(textField_8);

		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Pomme de la Terre");
		rdbtnNewRadioButton_9.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_9.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_9.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_9.setBounds(6, 287, 187, 21);
		panel.add(rdbtnNewRadioButton_9);

		JLabel lblNewLabel_1_9 = new JLabel("Nombre");
		lblNewLabel_1_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_9.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_9.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_9.setOpaque(true);
		lblNewLabel_1_9.setBounds(199, 286, 68, 23);
		panel.add(lblNewLabel_1_9);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(277, 288, 96, 19);
		panel.add(textField_9);

		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Potiron");
		rdbtnNewRadioButton_10.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_10.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_10.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_10.setBounds(6, 315, 187, 21);
		panel.add(rdbtnNewRadioButton_10);

		JLabel lblNewLabel_1_10 = new JLabel("Nombre");
		lblNewLabel_1_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_10.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_10.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_10.setOpaque(true);
		lblNewLabel_1_10.setBounds(199, 314, 68, 23);
		panel.add(lblNewLabel_1_10);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(277, 316, 96, 19);
		panel.add(textField_10);

		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Radis");
		rdbtnNewRadioButton_11.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_11.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_11.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_11.setBounds(6, 343, 187, 21);
		panel.add(rdbtnNewRadioButton_11);

		JLabel lblNewLabel_1_11 = new JLabel("Nombre");
		lblNewLabel_1_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_11.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_11.setOpaque(true);
		lblNewLabel_1_11.setBounds(199, 342, 68, 23);
		panel.add(lblNewLabel_1_11);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(277, 344, 96, 19);
		panel.add(textField_11);

		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Salade");
		rdbtnNewRadioButton_12.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_12.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_12.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_12.setBounds(6, 371, 187, 21);
		panel.add(rdbtnNewRadioButton_12);

		JLabel lblNewLabel_1_12 = new JLabel("Nombre");
		lblNewLabel_1_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_12.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_12.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_12.setOpaque(true);
		lblNewLabel_1_12.setBounds(199, 370, 68, 23);
		panel.add(lblNewLabel_1_12);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(277, 372, 96, 19);
		panel.add(textField_12);

		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Tomate");
		rdbtnNewRadioButton_13.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_13.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_13.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_13.setBounds(6, 399, 187, 21);
		panel.add(rdbtnNewRadioButton_13);

		JLabel lblNewLabel_1_13 = new JLabel("Nombre");
		lblNewLabel_1_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_13.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_13.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_13.setOpaque(true);
		lblNewLabel_1_13.setBounds(199, 398, 68, 23);
		panel.add(lblNewLabel_1_13);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(277, 400, 96, 19);
		panel.add(textField_13);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Coriandre");
		rdbtnNewRadioButton_3_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_3_1.setFont(new Font("Goudy Old Style", Font.BOLD, 15));
		rdbtnNewRadioButton_3_1.setBackground(new Color(34, 139, 34));
		rdbtnNewRadioButton_3_1.setBounds(6, 90, 187, 21);
		panel.add(rdbtnNewRadioButton_3_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Nombre");
		lblNewLabel_1_3_1.setOpaque(true);
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Goudy Old Style", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_3_1.setBounds(199, 89, 68, 23);
		panel.add(lblNewLabel_1_3_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(277, 91, 96, 19);
		panel.add(textField_14);

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

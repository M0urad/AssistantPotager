package menus;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import app.App;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

public class pageParametres {

	private static JFrame jf;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame genererPageParametres() {
		
		jf = new JFrame("Thousand Sunny's Garden");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 300);
		jf.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Fermer");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
			}
		});
		btnNewButton.setBounds(337, 11, 89, 23);
		jf.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modifier mon compte (à venir)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(58, 124, 311, 23);
		jf.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Changer de compte (\u00E0 venir)");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(58, 172, 311, 23);
		jf.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("Nom d'utilisateur : " + App.compte.getLogin());
		lblNewLabel.setBounds(148, 63, 278, 14);
		jf.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Location : " + App.compte.getVille());
		lblNewLabel_1.setBounds(148, 88, 278, 14);
		jf.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Avatar");
		lblNewLabel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_2.setBounds(61, 63, 50, 50);
		lblNewLabel_2.setIcon(new ImageIcon(pageParametres.class.getResource("/images/jojoT50x50.jpg")));
		jf.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Photo de profil : ");
		lblNewLabel_3.setBounds(51, 43, 125, 14);
		jf.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1_1_1 = new JButton("D\u00E9connexion");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				pageSeConnecter.seConnecter(App.comptes);
			}
		});
		btnNewButton_1_1_1.setBounds(58, 218, 311, 23);
		jf.getContentPane().add(btnNewButton_1_1_1);
		
		jf.setVisible(true);
		return jf;
		// TODO Auto-generated constructor stub
		
	}

}

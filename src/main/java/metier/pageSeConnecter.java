package metier;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class pageSeConnecter {
	public static JFrame jf;
	private static JTextField textField1;
	private static JTextField textField2;
	private static Compte user1=new Compte("user1","user1","Versailles","78000","FR","biloute");


	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame seConnecter(Compte user) {



		jf = new JFrame("Thounsand Sunny's Little Garden");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 700);
		jf.getContentPane().setLayout(null);

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
		
		JButton btnNewButton = new JButton("Creer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField1.getText().equalsIgnoreCase("user1") && textField1.getText().equalsIgnoreCase("user1")) {
					jf.setVisible(false);
					pageHomeGarden.genererPageHomeGarden();
				}

				else {
					jf.setVisible(false);
					pageCreerCompte.creerCompte();
				}
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setIconTextGap(3);
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(245, 222, 179), new Color(47, 79, 79), new Color(47, 79, 79), new Color(255, 222, 173)));
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBounds(161, 352, 110, 40);
		jf.getContentPane().add(btnNewButton);

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
		seConnecter(user1);
	}

}

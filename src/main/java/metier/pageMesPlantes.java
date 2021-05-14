package metier;

import javax.swing.JFrame;

import meteo.valeurs;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pageMesPlantes {

	private static JFrame jf;
	//""+meteo.valeurs.a.get(0)


	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame genererPageMesPlantes() {

		valeurs.main(null);

		jf = new JFrame("Thounsand Sunny's Garden");
		jf.getContentPane().setForeground(Color.PINK);
		jf.getContentPane().setBackground(Color.ORANGE);
		jf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLANTES");
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 34));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(107, 109, 319, 234);
		jf.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("RETOUR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				pageHomeGarden.genererPageHomeGarden();

			}
		});
		btnNewButton.setFont(new Font("Shaka Pow Upright Hollow", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(10, 26, 89, 23);
		jf.getContentPane().add(btnNewButton);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(400, 20, 450, 700);
		jf.setVisible(true);
		return jf;
	}	
}

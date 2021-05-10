package metier;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;



public class pageHomeGarden {
	
	
	private static JFrame jf;


	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame genererPageHomeGarden() {

		jf = new JFrame("Thounsand Sunny's Garden");
		jf.setBounds(400, 20, 500, 840);
		jf.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(455, 0, 21, 700);
		jf.getContentPane().add(scrollPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/meteo440x145.jpg")));
		btnNewButton.setBounds(24, 0, 440, 145);
		jf.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/potager440x154.jpg")));
		btnNewButton_1.setBounds(24, 150, 440, 154);
		jf.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/Cuisine440x182.jpg")));
		btnNewButton_1_1.setBounds(24, 310, 440, 160);
		jf.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1_1.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/News440x184.jpg")));
		btnNewButton_1_1_1.setBounds(24, 477, 440, 160);
		jf.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(pageHomeGarden.class.getResource("/images/GardenArena440x161.jpg")));
		btnNewButton_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1_1_1_1.setBounds(24, 640, 440, 160);
		jf.getContentPane().add(btnNewButton_1_1_1_1);
		
		
		jf.setVisible(true);
	
		return jf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genererPageHomeGarden();

	}
}

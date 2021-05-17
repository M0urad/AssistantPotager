package metier;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class pageMeteo {
	
	private static JFrame jf;
	//""+meteo.valeurs.a.get(0)


	/**
	 * @wbp.parser.entryPoint
	 */
	public static JFrame genererPageMeteo() {
	jf = new JFrame("METEO avec Thounsand Sunny's Little Garden");
	jf.getContentPane().setBackground(new Color(135, 206, 235));
	jf.getContentPane().setForeground(new Color(30, 144, 255));
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setBounds(400, 20, 450, 700);
	jf.getContentPane().setLayout(null);
	
	JPanel weathereport = new JPanel();
	weathereport.setBackground(new Color(173, 216, 230));
	weathereport.setBorder(new TitledBorder(null, "METEO EN CE MOMENT", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	weathereport.setBounds(10, 69, 175, 178);
	
	jf.getContentPane().add(weathereport);
	weathereport.setLayout(null);
	
	JLabel lblNewLabel_5 = new JLabel("iconemeteo");
	lblNewLabel_5.setBounds(10, 59, 99, 97);
	//if beau temps
//	lblNewLabel_5.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/telechargement.png")));
//	if nuages
//	lblNewLabel_5.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/petitnuage.png")));
//	if pluie
//	lblNewLabel_5.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/nuagepluie.png")));


	weathereport.add(lblNewLabel_5);
	
	JPanel weatherdata = new JPanel();
	weatherdata.setBackground(new Color(173, 216, 230));
	weatherdata.setBorder(new TitledBorder(null, "DONNEES METEO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	weatherdata.setBounds(213, 69, 213, 178);
	jf.getContentPane().add(weatherdata);
	weatherdata.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Donn\u00E9e1..............................23");
	lblNewLabel.setBounds(10, 32, 181, 14);
	weatherdata.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Donn\u00E9e2..............................23");
	lblNewLabel_1.setBounds(10, 57, 181, 14);
	weatherdata.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Donn\u00E9e3..............................23");
	lblNewLabel_2.setBounds(10, 82, 181, 14);
	weatherdata.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("Donn\u00E9e4..............................23");
	lblNewLabel_3.setBounds(10, 107, 181, 14);
	weatherdata.add(lblNewLabel_3);
	
	JLabel lblNewLabel_4 = new JLabel("Donn\u00E9e5..............................23");
	lblNewLabel_4.setBounds(10, 132, 181, 14);
	weatherdata.add(lblNewLabel_4);
	
	JPanel nextdays = new JPanel();
	nextdays.setBackground(new Color(173, 216, 230));
	nextdays.setBorder(new TitledBorder(null, "PREVISIONS PROCHAINS JOURS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	nextdays.setForeground(new Color(0, 100, 0));
	nextdays.setBounds(10, 296, 416, 190);
	jf.getContentPane().add(nextdays);
	nextdays.setLayout(null);
	
	JPanel weathereport_1 = new JPanel();
	weathereport_1.setLayout(null);
	weathereport_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DEMAIN", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	weathereport_1.setBackground(new Color(173, 216, 230));
	weathereport_1.setBounds(20, 32, 119, 124);
	nextdays.add(weathereport_1);
	
	JLabel lblNewLabel_5_1 = new JLabel("iconemeteo");
	lblNewLabel_5_1.setBounds(10, 11, 99, 97);
	weathereport_1.add(lblNewLabel_5_1);
	
	JPanel weathereport_1_1 = new JPanel();
	weathereport_1_1.setLayout(null);
	weathereport_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "APRES-DEMAIN", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	weathereport_1_1.setBackground(new Color(173, 216, 230));
	weathereport_1_1.setBounds(149, 32, 119, 124);
	nextdays.add(weathereport_1_1);
	
	JLabel lblNewLabel_5_1_1 = new JLabel("iconemeteo");
	lblNewLabel_5_1_1.setBounds(10, 11, 99, 97);
	weathereport_1_1.add(lblNewLabel_5_1_1);
	
	JPanel weathereport_1_2 = new JPanel();
	weathereport_1_2.setLayout(null);
	weathereport_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DANS 3 JOURS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	weathereport_1_2.setBackground(new Color(173, 216, 230));
	weathereport_1_2.setBounds(278, 32, 119, 124);
	nextdays.add(weathereport_1_2);
	
	JLabel lblNewLabel_5_1_2 = new JLabel("iconemeteo");
	lblNewLabel_5_1_2.setBounds(10, 11, 99, 97);
	weathereport_1_2.add(lblNewLabel_5_1_2);
	
	JLabel lblNewLabel_7 = new JLabel("METEO");
	lblNewLabel_7.setFont(new Font("Wildjess", Font.ITALIC, 23));
	lblNewLabel_7.setForeground(new Color(255, 255, 0));
	lblNewLabel_7.setBounds(155, 11, 162, 33);
	jf.getContentPane().add(lblNewLabel_7);
	
	JButton btnNewButton = new JButton("RETOUR");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			jf.setVisible(false);
			pageHomeGarden.genererPageHomeGarden();
		}
	});
	btnNewButton.setBounds(155, 539, 89, 23);
	jf.getContentPane().add(btnNewButton);
	jf.setVisible(true);
	return jf;
	}
}

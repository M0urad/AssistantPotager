package metier;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;

import meteo.valeurs;

import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
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
	
	valeurs.main(null);

	
	JPanel weathereport = new JPanel();
	weathereport.setBackground(new Color(173, 216, 230));
	weathereport.setBorder(new TitledBorder(null, "METEO EN CE MOMENT", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	weathereport.setBounds(10, 69, 175, 178);
	
	jf.getContentPane().add(weathereport);
	weathereport.setLayout(null);
	
	JLabel lblNewLabel_5 = new JLabel("iconemeteo");
	lblNewLabel_5.setBounds(31, 41, 99, 97);

	if (meteo.valeurs.nebu.get(0).value > 50) {
	lblNewLabel_5.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/petitnuage99x97.png")));}
	else if (meteo.valeurs.humi.get(0).value > 50) {
	lblNewLabel_5.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/nuagepluie99x97.png")));}
	else lblNewLabel_5.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/soleil99x97.png")));

	weathereport.add(lblNewLabel_5);
	
	JPanel weatherdata = new JPanel();
	weatherdata.setBackground(new Color(173, 216, 230));
	weatherdata.setBorder(new TitledBorder(null, "DONNEES METEO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	weatherdata.setBounds(213, 69, 213, 178);
	jf.getContentPane().add(weatherdata);
	weatherdata.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Vent moyen");
	lblNewLabel.setBounds(10, 32, 134, 14);
	weatherdata.add(lblNewLabel);
	JLabel lblNewLabel_6 = new JLabel("" + meteo.valeurs.humi.get(0).value + " km/h");
	lblNewLabel_6.setBounds(127, 32, 88, 14);
	weatherdata.add(lblNewLabel_6);
	
	JLabel lblNewLabel_1 = new JLabel("Rafales");
	lblNewLabel_1.setBounds(10, 57, 134, 14);
	weatherdata.add(lblNewLabel_1);
	JLabel lblNewLabel_6_1 = new JLabel("" + meteo.valeurs.ventraf.get(0).value + " km/h");
	lblNewLabel_6_1.setBounds(127, 57, 76, 14);
	weatherdata.add(lblNewLabel_6_1);
	
	JLabel lblNewLabel_2 = new JLabel("N\u00E9bulosit\u00E9");
	lblNewLabel_2.setBounds(10, 82, 76, 14);
	weatherdata.add(lblNewLabel_2);
	JLabel lblNewLabel_6_2 = new JLabel("" + meteo.valeurs.nebu.get(0).value + "%");
	lblNewLabel_6_2.setBounds(127, 82, 76, 14);
	weatherdata.add(lblNewLabel_6_2);
	
	JLabel lblNewLabel_3 = new JLabel("Humidit\u00E9");
	lblNewLabel_3.setBounds(10, 107, 76, 14);
	weatherdata.add(lblNewLabel_3);
	JLabel lblNewLabel_6_3 = new JLabel("" + meteo.valeurs.humi.get(0).value + "%");
	lblNewLabel_6_3.setBounds(127, 107, 76, 14);
	weatherdata.add(lblNewLabel_6_3);
	
	JLabel lblNewLabel_4 = new JLabel("Temp\u00E9rature");
	lblNewLabel_4.setBounds(10, 132, 88, 14);
	weatherdata.add(lblNewLabel_4);
	
	JLabel lblNewLabel_6_4 = new JLabel("" + (int)(meteo.valeurs.a.get(0).value-273.15) + "°C");
	lblNewLabel_6_4.setBounds(127, 132, 76, 14);
	weatherdata.add(lblNewLabel_6_4);
	
	JLabel lblNewLabel_4_1 = new JLabel("Pression");
	lblNewLabel_4_1.setBounds(10, 153, 88, 14);
	weatherdata.add(lblNewLabel_4_1);
	
	JLabel lblNewLabel_6_4_1 = new JLabel("" + (meteo.valeurs.pression.get(0).value/100) + " hPa");
	lblNewLabel_6_4_1.setBounds(127, 157, 76, 14);
	weatherdata.add(lblNewLabel_6_4_1);
	
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
	lblNewLabel_5_1.setBounds(10, 16, 99, 97);
	if (meteo.valeurs.nebu.get(0).value > 50) {
		lblNewLabel_5_1.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/petitnuage99x97.png")));}
		else if (meteo.valeurs.humi.get(0).value > 50) {
			lblNewLabel_5_1.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/nuagepluie99x97.png")));}
		else lblNewLabel_5_1.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/soleil99x97.png")));
	weathereport_1.add(lblNewLabel_5_1);
	
	JPanel weathereport_1_1 = new JPanel();
	weathereport_1_1.setLayout(null);
	weathereport_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "APRES-DEMAIN", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	weathereport_1_1.setBackground(new Color(173, 216, 230));
	weathereport_1_1.setBounds(149, 32, 119, 124);
	
	nextdays.add(weathereport_1_1);
	
	JLabel lblNewLabel_5_1_1 = new JLabel("iconemeteo");
	lblNewLabel_5_1_1.setBounds(10, 16, 99, 97);
	if (meteo.valeurs.nebu.get(4).value > 50) {
		lblNewLabel_5_1_1.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/petitnuage99x97.png")));}
		else if (meteo.valeurs.humi.get(4).value > 50) {
			lblNewLabel_5_1_1.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/nuagepluie99x97.png")));}
		else lblNewLabel_5_1_1.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/soleil99x97.png")));
	weathereport_1_1.add(lblNewLabel_5_1_1);
	
	JPanel weathereport_1_2 = new JPanel();
	weathereport_1_2.setLayout(null);
	weathereport_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DANS 3 JOURS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	weathereport_1_2.setBackground(new Color(173, 216, 230));
	weathereport_1_2.setBounds(278, 32, 119, 124);
	
	nextdays.add(weathereport_1_2);
	
	JLabel lblNewLabel_5_1_2 = new JLabel("iconemeteo");
	lblNewLabel_5_1_2.setBounds(10, 16, 99, 97);
	if (meteo.valeurs.nebu.get(6).value > 50) {
		lblNewLabel_5_1_2.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/petitnuage99x97.png")));}
		else if (meteo.valeurs.humi.get(6).value > 50) {
			lblNewLabel_5_1_2.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/nuagepluie99x97.png")));}
		else lblNewLabel_5_1_2.setIcon(new ImageIcon(pageMeteo.class.getResource("/images/soleil99x97.png")));
	weathereport_1_2.add(lblNewLabel_5_1_2);
	
	JLabel lblNewLabel_7 = new JLabel("METEO");
	lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_7.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
	lblNewLabel_7.setForeground(new Color(240, 248, 255));
	lblNewLabel_7.setBounds(127, 11, 162, 33);
	jf.getContentPane().add(lblNewLabel_7);
	
	JButton btnNewButton = new JButton("RETOUR");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			jf.setVisible(false);
			pageHomeGarden.genererPageHomeGarden();
		}
	});
	btnNewButton.setBounds(10, 20, 89, 23);
	jf.getContentPane().add(btnNewButton);
	jf.setVisible(true);
	return jf;
	}
	
	public static void main(String[] args) {
		genererPageMeteo();
	}
}

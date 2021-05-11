package metier;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "Personne")
public class Personne {

	@XmlElement(name = "nom")
	private String nom;
	@XmlElement(name = "prenom")
	private String prenom;
	@XmlElement(name = "age")
	private int age;
//	@XmlElement(name = "adresse")
//	private Adresses adresses;
	@XmlElement(name = "adresse")
	//private List<metier.Adresse> adresse;
//	private Adresse adresse;
	private List<Adresse> adresses=new ArrayList();
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}

	public Personne(String nom, String prenom, int age, List<metier.Adresse> adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresses = adresse;
	}
//	public Personne(String nom, String prenom, int age, Adresse adresse) {
//		this.nom = nom;
//		this.prenom = prenom;
//		this.age = age;
//		this.adresse = adresse;
//	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<metier.Adresse> getAdresse() {
		return adresses;
	}

	public void setAdresse(List<metier.Adresse> adresse) {
		this.adresses = adresse;
	}
//	public Adresse getAdresse() {
//		return adresse;
//	}
//
//	public void setAdresse(Adresse adresse) {
//		this.adresse = adresse;
//	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresses + "]";
	}
	
	
	
	
	
	
	
}

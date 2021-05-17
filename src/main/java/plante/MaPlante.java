package plante;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import metier.Compte;

@Entity
public class MaPlante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String surnom;
	private LocalDate dateGermination;
	@ManyToOne
	private Plante plante;
	@ManyToOne
	private Compte compte;
	
	
	public MaPlante() {
		// TODO Auto-generated constructor stub
	}

	public MaPlante(String surnom, LocalDate dateGermination, Plante plante, Compte compte) {
		this.compte=compte;
		this.plante=plante;
		this.surnom=surnom;
		this.dateGermination=dateGermination;

	}
	
	public MaPlante(Plante plante, Compte compte) {
		this.compte=compte;
		this.plante=plante;
//		this.surnom=surnom;
//		this.dateGermination=dateGermination;

	}
	

	public int getId() {
		return id;
	}

	public String getSurnom() {
		return surnom;
	}

	public LocalDate getDateGermination() {
		return dateGermination;
	}

	public Plante getPlante() {
		return plante;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public void setDateGermination(LocalDate dateGermination) {
		this.dateGermination = dateGermination;
	}

	public void setPlante(Plante plante) {
		this.plante = plante;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "MaPlante [id=" + id + ", surnom=" + surnom + ", dateGermination=" + dateGermination + ", plante="
				+ plante + ", compte=" + compte + "]";
	}
	
	
	
	

}

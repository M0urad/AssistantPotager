package plante;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Plante 
{  
	@Id
	protected String nom;
	protected String description;
	protected String typeSol;
	protected String type;
	protected int dureeGermination;
	protected double irrigation;
	protected double hauteur;
	protected double priseAuSol;
	protected LocalDate dateGermination;
	
	protected LocalDate dateRecolteDebut;
	protected LocalDate dateRecolteFin;
	
	protected LocalDate datePlantationDebut;
	protected LocalDate datePlantationFin;

	
	public Plante() {}
	public Plante(String nom) {
		this.nom = nom;
	}
	

	public LocalDate getDateRecolteDebut() {
		return dateRecolteDebut;
	}
	public LocalDate getDateRecolteFin() {
		return dateRecolteFin;
	}
	public LocalDate getDatePlantationDebut() {
		return datePlantationDebut;
	}
	public LocalDate getDatePlantationFin() {
		return datePlantationFin;
	}
	public void setDateRecolteDebut(LocalDate dateRecolteDebut) {
		this.dateRecolteDebut = dateRecolteDebut;
	}
	public void setDateRecolteFin(LocalDate dateRecolteFin) {
		this.dateRecolteFin = dateRecolteFin;
	}
	public void setDatePlantationDebut(LocalDate datePlantationDebut) {
		this.datePlantationDebut = datePlantationDebut;
	}
	public void setDatePlantationFin(LocalDate datePlantationFin) {
		this.datePlantationFin = datePlantationFin;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeSol() {
		return typeSol;
	}

	public void setTypeSol(String typeSol) {
		this.typeSol = typeSol;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDureeGermination() {
		return dureeGermination;
	}

	public void setDureeGermination(int dureeGermination) {
		this.dureeGermination = dureeGermination;
	}

	public double getIrrigation() {
		return irrigation;
	}

	public void setIrrigation(double irrigation) {
		this.irrigation = irrigation;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getPriseAuSol() {
		return priseAuSol;
	}

	public void setPriseAuSol(double priseAuSol) {
		this.priseAuSol = priseAuSol;
	}

	public LocalDate getDateGermination() {
		return dateGermination;
	}

	public void setDateGermination(LocalDate dateGermination) {
		this.dateGermination = dateGermination;
	}

	@Override
	public String toString() {
		return "Plante [nom=" + nom + ", description=" + description + ", typeSol=" + typeSol + ", type=" + type
				+ ", dureeGermination=" + dureeGermination + ", irrigation=" + irrigation + ", hauteur=" + hauteur
				+ ", priseAuSol=" + priseAuSol + ", dateGermination=" + dateGermination + "]";
	}

}

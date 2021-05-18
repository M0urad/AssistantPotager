package plante;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Plante")

public abstract class Plante 
{  
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	@Column(columnDefinition = "LONGTEXT")
	protected String description;
	protected String typeSol;
	protected String type;
	protected int dureeGermination;
	protected double irrigation;
	protected double hauteur;
	protected double priseAuSol;
	
	@OneToMany (mappedBy = "plante")
	private List<MaPlante> mesPlante;

	protected LocalDate dateRecolteDebut;
	protected LocalDate dateRecolteFin;
	
	protected LocalDate datePlantationDebut;
	protected LocalDate datePlantationFin;

	
	public Plante() {}

	

	public Plante(String description, String typeSol, String type, int dureeGermination, double irrigation,
			double hauteur, double priseAuSol, LocalDate dateRecolteDebut, LocalDate dateRecolteFin,
			LocalDate datePlantationDebut, LocalDate datePlantationFin) {
		this.description = description;
		this.typeSol = typeSol;
		this.type = type;
		this.dureeGermination = dureeGermination;
		this.irrigation = irrigation;
		this.hauteur = hauteur;
		this.priseAuSol = priseAuSol;
		this.dateRecolteDebut = dateRecolteDebut;
		this.dateRecolteFin = dateRecolteFin;
		this.datePlantationDebut = datePlantationDebut;
		this.datePlantationFin = datePlantationFin;
	}
	
	public int getId() {
		return id;
	}
	public List<MaPlante> getMesPlante() {
		return mesPlante;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMesPlante(List<MaPlante> mesPlante) {
		this.mesPlante = mesPlante;
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

	
	@Override
	public String toString() {
		return "Plante [description=" + description + ", typeSol=" + typeSol + ", type=" + type
				+ ", dureeGermination=" + dureeGermination + ", irrigation=" + irrigation + ", hauteur=" + hauteur
				+ ", priseAuSol=" + priseAuSol + "]";
	}

}

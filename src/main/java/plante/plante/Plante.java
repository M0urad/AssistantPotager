package plante;
import java.time.LocalDate;
import java.util.List;

public abstract class Plante 
{  
	protected String nom;
	protected String description;
	protected String typeSol;
	protected String type;
	protected int dureeGermination;
	protected double irrigation;
	protected double hauteur;
	protected double priseAuSol;
	protected LocalDate dateGermination;
	protected List<LocalDate> dateRecolte;
	protected List<LocalDate> datePlantation;
	
	
	public Plante(String nom) {
		this.nom = nom;
	}
	
	public List<LocalDate> getDateRecolte() {
		return dateRecolte;
	}

	public void setDateRecolte(List<LocalDate> dateRecolte) {
		this.dateRecolte = dateRecolte;
	}

	public List<LocalDate> getDatePlantation() {
		return datePlantation;
	}

	public void setDatePlantation(List<LocalDate> datePlantation) {
		this.datePlantation = datePlantation;
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

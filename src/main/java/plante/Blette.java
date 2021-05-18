package plante;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Blette extends Plante{

	public Blette() {
		super();
		this.description = "La blette c'est miam";
		this.datePlantationDebut=LocalDate.parse("2020-12-17");
		this.datePlantationFin = LocalDate.parse("2020-12-17");
		this.dateRecolteDebut=LocalDate.parse("2020-12-17");
		this.dateRecolteFin=LocalDate.parse("2020-12-17");
		this.dureeGermination=65;
		this.hauteur=35;
		this.irrigation=23.3;
		this.priseAuSol=4;
		this.type="legume";
		this.typeSol="Coco";
	}

}

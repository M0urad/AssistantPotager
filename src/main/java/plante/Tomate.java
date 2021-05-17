package plante;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Tomate extends Plante {

	public Tomate() {
		super();
		this.description = "La tomate c'est rouge";
		this.datePlantationDebut=LocalDate.parse("2020-12-17");
		this.datePlantationFin = LocalDate.parse("2020-12-17");
		this.dateRecolteDebut=LocalDate.parse("2020-12-17");
		this.dateRecolteFin=LocalDate.parse("2020-12-17");
		this.dureeGermination=65;
		this.hauteur=35;
		this.irrigation=23.3;
		this.priseAuSol=4;
		this.type="fruit";
		this.typeSol="Coco";	
}
		
}
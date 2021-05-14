package plante;

import javax.persistence.Entity;

@Entity
public class Tomates extends Plante {

	public Tomates() {}
	public Tomates(String nom) {
		super(nom);
	}
}

package plante;

import javax.persistence.Entity;

@Entity
public class Courgettes extends Plante {
	public Courgettes() {}
	public Courgettes(String nom) {
		super(nom);
	}
}

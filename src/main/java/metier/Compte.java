package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
	private String ville;
	private String email;
	
	
	public Compte() {}
	public Compte(String login, String password, String ville, String email) {
		this.login = login;
		this.password = password;
		this.ville = ville;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public String getLogin() {
		return login;
	}


	public String getPassword() {
		return password;
	}


	public String getVille() {
		return ville;
	}


	public String getEmail() {
		return email;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Compte [id=" + id + ", login=" + login + ", password=" + password + ", ville=" + ville + ", email="
				+ email + "]";
	}
	
	
	
	

}

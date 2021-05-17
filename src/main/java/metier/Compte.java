package metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import plante.MaPlante;

@Entity
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
	private String ville;
	private String CP;
	private String codePays;	
	private String email;
	@OneToMany (mappedBy = "compte")
	private List<MaPlante> mesPlantes;
	
	
	public Compte() {}

	public Compte(String login, String password, String ville, String cP, String codePays, String email) {
		this.login = login;
		this.password = password;
		this.ville = ville;
		CP = cP;
		this.codePays = codePays;
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

	

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public String getCodePays() {
		return codePays;
	}

	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", login=" + login + ", password=" + password + ", ville=" + ville + ", CP=" + CP
				+ ", codePays=" + codePays + ", email=" + email + "]";
	}

	

}

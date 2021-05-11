package metier;

import java.util.List;


public class Adresses {

	
	
    private List<Adresse> adresses;
 
    public List<Adresse> getAdresses() {
        return adresses;
    }
 
    public void setEmployees(List<Adresse> adresses) {
        this.adresses = adresses;
    }

	@Override
	public String toString() {
		return "Adresses [adresses=" + adresses + "]";
	}
    

	
}

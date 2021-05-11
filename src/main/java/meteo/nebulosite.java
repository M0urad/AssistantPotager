package meteo;

import java.util.List;

public class nebulosite {

	private List<meteo.level> level;
	
	

	public nebulosite() {
	}

	public nebulosite(List<meteo.level> level) {
		this.level = level;
	}

	public List<meteo.level> getLevel() {
		return level;
	}

	public void setLevel(List<meteo.level> level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "nebulosite [level=" + level + "]";
	}


	
	

}

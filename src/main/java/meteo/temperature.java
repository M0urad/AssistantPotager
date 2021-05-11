package meteo;

import java.util.List;

public class temperature {
	
	private List<meteo.level> level;
	
	

	public temperature() {
	}

	public temperature(List<meteo.level> level) {
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
		return "temperature [level=" + level + "]";
	}
	
	

}

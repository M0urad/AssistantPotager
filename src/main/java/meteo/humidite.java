package meteo;

import java.util.List;

public class humidite {
	
	private List<meteo.level> level;

	public humidite() {
	}

	public humidite(List<meteo.level> level) {
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
		return "humidite [level=" + level + "]";
	}

	

}

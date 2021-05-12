package meteo;

import java.util.List;

public class vent_moyen {

	public List<meteo.level> level;

	public void setLevel(List<meteo.level> level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "vent_moyen [level=" + level + "]";
	}

	
	
}

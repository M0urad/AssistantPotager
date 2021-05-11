package meteo;

import java.util.List;

public class vent_moyen {

	private List<meteo.level> level;

	public vent_moyen() {
	}

	public vent_moyen(List<meteo.level> level) {
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
		return "vent_moyen [level=" + level + "]";
	}

	
	
}

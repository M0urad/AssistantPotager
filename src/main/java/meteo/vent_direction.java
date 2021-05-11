package meteo;

import java.util.List;

public class vent_direction {

	private List<meteo.level> level;

	public vent_direction() {
	}

	public vent_direction(List<meteo.level> level) {
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
		return "vent_direction [level=" + level + "]";
	}

	

	
	

}

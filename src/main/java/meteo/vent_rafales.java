package meteo;

public class vent_rafales {
	

	private level level;

	
	
	
	public vent_rafales() {
	}

	public vent_rafales(meteo.level level) {
		this.level = level;
	}

	public level getLevel() {
		return level;
	}

	public void setLevel(meteo.level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "humidite [level=" + level + "]";
	}
	
	

}

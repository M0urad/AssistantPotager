package meteo;

public class vent_rafales {
	

	public level level;

	public void setLevel(meteo.level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "humidite [level=" + level + "]";
	}
	
	

}

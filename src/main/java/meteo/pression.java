package meteo;

public class pression {
	
	private level level;
	
	

	public pression() {
	}

	public pression(meteo.level level) {
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
		return "pression [level=" + level + "]";
	}
	
	

}

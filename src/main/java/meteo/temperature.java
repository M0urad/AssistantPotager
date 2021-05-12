package meteo;

import java.util.List;

public class temperature {
	
	public List<meteo.level> level;
	
	
	public void setLevel(List<meteo.level> level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "temperature [level=" + level + "]";
	}
	
	

}

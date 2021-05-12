package meteo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="humidite")
public class humidite {
	
	@XmlElement(name="level")
	public List<meteo.level> level;

	public void setLevel(List<meteo.level> level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "humidite [level=" + level + "]";
	}

	

}

package meteo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class pluie_convective {
	
	@XmlAttribute
	public String interval;
	@XmlValue
	public double value;
	
	
	public void setInterval(String interval) {
		this.interval = interval;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "pluie [interval=" + interval + ", value=" + value + "]";
	}
	
	

}

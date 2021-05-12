package meteo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="level")
public class level {
	
	@XmlAttribute(name="val")
	public String val;
	@XmlValue
	public double value;
	
	public void setVal(String val) {
		this.val = val;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "level [val=" + val + ", value=" + value + "]";
	}
	
	

}

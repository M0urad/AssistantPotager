package meteo;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
@XmlRootElement
public class level {
	
	private String val;
	@JacksonXmlText
	private double value;
	
	public level() {
	}
	public level(String val, double value) {
		super();
		this.val = val;
		this.value = value;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "level [val=" + val + ", value=" + value + "]";
	}
	
	

}

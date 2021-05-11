package meteo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class pluie_convective {
	
	private int interval;
	@JacksonXmlText
	private int value;
	
	
	
	
	public pluie_convective() {
	}
	public pluie_convective(int interval, int value) {
		super();
		this.interval = interval;
		this.value = value;
	}
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "pluie [interval=" + interval + ", value=" + value + "]";
	}
	
	

}

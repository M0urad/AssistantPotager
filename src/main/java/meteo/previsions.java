package meteo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="previsions")
public class previsions {
	
	@XmlElement(name="request_state")
	public int request_state;
	@XmlElement(name="source")
	public String source;
	@XmlElement(name="message")
	public String message;
	@XmlElement(name="request_time")
	public double request_time;
	@XmlElement(name="request_key")
	public String request_key;
	@XmlElement(name="model_run")
	public String model_run;
	@XmlElement(name="echeance")
	public List<meteo.echeance> echeance;

	public void setRequest_state(int request_state) {
		this.request_state = request_state;
	}
	
	public void setSource(String source) {
		this.source = source;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setRequest_time(double request_time) {
		this.request_time = request_time;
	}

	public void setRequest_key(String request_key) {
		this.request_key = request_key;
	}

	public void setModel_run(String model_run) {
		this.model_run = model_run;
	}

	public void setEcheances(List<echeance> echeance) {
		this.echeance = echeance;
	}

	@Override
	public String toString() {
		return "previsions [request_state=" + request_state + ", source=" + source + ", message=" + message
				+ ", request_time=" + request_time + ", request_key=" + request_key + ", model_run=" + model_run
				+ ", echeance=" + echeance + "]";
	}

	
	
	
	
	

}

package meteo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class previsions {
	
	protected int request_state;
	protected String source;
	protected String message;
	protected double request_time;
	protected String request_key;
	protected String model_run;
	protected List<meteo.echeance> echeance;
	
	
	
	public previsions() {
	}

	public previsions(int request_state, String source, String message, double request_time, String request_key,
			String model_run, List<meteo.echeance> echeance) {
		this.request_state = request_state;
		this.source = source;
		this.message = message;
		this.request_time = request_time;
		this.request_key = request_key;
		this.model_run = model_run;
		this.echeance = echeance;
	}

	public int getRequest_state() {
		return request_state;
	}

	public void setRequest_state(int request_state) {
		this.request_state = request_state;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getRequest_time() {
		return request_time;
	}

	public void setRequest_time(double request_time) {
		this.request_time = request_time;
	}

	public String getRequest_key() {
		return request_key;
	}

	public void setRequest_key(String request_key) {
		this.request_key = request_key;
	}

	public String getModel_run() {
		return model_run;
	}

	public void setModel_run(String model_run) {
		this.model_run = model_run;
	}

	public List<echeance> getEcheance() {
		return echeance;
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

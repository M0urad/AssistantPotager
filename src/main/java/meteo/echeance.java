package meteo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="echeance")
public class echeance {
	
	@XmlElement(name="hour")
	public String hour;
	@XmlElement(name="timestamp")
	public String timestamp;
	@XmlElement(name="temperature")
	public temperature temperature;
	@XmlElement(name="pression")
	public pression pression;
	@XmlElement(name="pluie")
	public pluie pluie;
	@XmlElement(name="pluie_convective")
	public pluie_convective pluie_convective;
	@XmlElement(name="humidite")
	public humidite humidite;
	@XmlElement(name="vent_moyen")
	public vent_moyen vent_moyen;
	@XmlElement(name="vent_rafales")
	public vent_rafales vent_rafales;
	@XmlElement(name="	public")
	public vent_direction vent_direction;
	@XmlElement(name="iso_zero")
	public int iso_zero;
	@XmlElement(name="risque_neige")
	public String risque_neige;
	@XmlElement(name="cape")
	public int cape;
	@XmlElement(name="nebulosite")
	public nebulosite nebulosite;
	
	
	
	public void setHour(String hour) {
		this.hour = hour;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setTemperature(temperature temperature) {
		this.temperature = temperature;
	}

	public void setPression(pression pression) {
		this.pression = pression;
	}

	public void setPluie(pluie pluie) {
		this.pluie = pluie;
	}

	public void setPluie_convective(pluie_convective pluie_convective) {
		this.pluie_convective = pluie_convective;
	}

	public void setHumidite(humidite humidite) {
		this.humidite = humidite;
	}

	public void setVent_moyen(vent_moyen vent_moyen) {
		this.vent_moyen = vent_moyen;
	}

	public void setVent_rafales(vent_rafales vent_rafales) {
		this.vent_rafales = vent_rafales;
	}

	public void setVent_direction(vent_direction vent_direction) {
		this.vent_direction = vent_direction;
	}

	public void setIso_zero(int iso_zero) {
		this.iso_zero = iso_zero;
	}

	public void setRisque_neige(String risque_neige) {
		this.risque_neige = risque_neige;
	}

	public void setCape(int cape) {
		this.cape = cape;
	}

	public void setNebulosite(nebulosite nebulosite) {
		this.nebulosite = nebulosite;
	}

	@Override
	public String toString() {
		return "echeance [hour=" + hour + ", timestamp=" + timestamp + ", temperature=" + temperature + ", pression="
				+ pression + ", pluie=" + pluie + ", pluie_convective=" + pluie_convective + ", humidite=" + humidite
				+ ", vent_moyen=" + vent_moyen + ", vent_rafales=" + vent_rafales + ", vent_direction=" + vent_direction
				+ ", iso_zero=" + iso_zero + ", risque_neige=" + risque_neige + ", cape=" + cape + ", nebulosite="
				+ nebulosite + "]";
	}
	
	
	
	
	
}

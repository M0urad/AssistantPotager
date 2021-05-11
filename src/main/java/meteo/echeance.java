package meteo;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class echeance {
	
	private String hour;
	private String timestamp;
	private temperature temperature;
	private pression pression;
	private pluie pluie;
	private pluie_convective pluie_convective;
	private humidite humidite;
	private vent_moyen vent_moyen;
	private vent_rafales vent_rafales;
	private vent_direction vent_direction;
	private int iso_zero;
	private String risque_neige;
	private int cape;
	private nebulosite nebulosite;
	
	
	
	public echeance() {
	}

	public echeance(String hour, String timestamp, meteo.temperature temperature, meteo.pression pression,
			meteo.pluie pluie, meteo.pluie_convective pluie_convective, meteo.humidite humidite,
			meteo.vent_moyen vent_moyen, meteo.vent_rafales vent_rafales, meteo.vent_direction vent_direction,
			int iso_zero, String risque_neige, int cape, meteo.nebulosite nebulosite) {
		this.hour = hour;
		this.timestamp = timestamp;
		this.temperature = temperature;
		this.pression = pression;
		this.pluie = pluie;
		this.pluie_convective = pluie_convective;
		this.humidite = humidite;
		this.vent_moyen = vent_moyen;
		this.vent_rafales = vent_rafales;
		this.vent_direction = vent_direction;
		this.iso_zero = iso_zero;
		this.risque_neige = risque_neige;
		this.cape = cape;
		this.nebulosite = nebulosite;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(temperature temperature) {
		this.temperature = temperature;
	}

	public pression getPression() {
		return pression;
	}

	public void setPression(pression pression) {
		this.pression = pression;
	}

	public pluie getPluie() {
		return pluie;
	}

	public void setPluie(pluie pluie) {
		this.pluie = pluie;
	}

	public pluie_convective getPluie_convective() {
		return pluie_convective;
	}

	public void setPluie_convective(pluie_convective pluie_convective) {
		this.pluie_convective = pluie_convective;
	}

	public humidite getHumidite() {
		return humidite;
	}

	public void setHumidite(humidite humidite) {
		this.humidite = humidite;
	}

	public vent_moyen getVent_moyen() {
		return vent_moyen;
	}

	public void setVent_moyen(vent_moyen vent_moyen) {
		this.vent_moyen = vent_moyen;
	}

	public vent_rafales getVent_rafales() {
		return vent_rafales;
	}

	public void setVent_rafales(vent_rafales vent_rafales) {
		this.vent_rafales = vent_rafales;
	}

	public vent_direction getVent_direction() {
		return vent_direction;
	}

	public void setVent_direction(vent_direction vent_direction) {
		this.vent_direction = vent_direction;
	}

	public int getIso_zero() {
		return iso_zero;
	}

	public void setIso_zero(int iso_zero) {
		this.iso_zero = iso_zero;
	}

	public String getRisque_neige() {
		return risque_neige;
	}

	public void setRisque_neige(String risque_neige) {
		this.risque_neige = risque_neige;
	}

	public int getCape() {
		return cape;
	}

	public void setCape(int cape) {
		this.cape = cape;
	}

	public nebulosite getNebulosite() {
		return nebulosite;
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

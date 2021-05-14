package location;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="address")
public class Address {
	
	@XmlElement(name="street")
	public String street;
	@XmlElement(name="houseNumber")
	public int houseNumber;
	@XmlElement(name="locality")
	public String locality;
	@XmlElement(name="postalcode")
	public int postalcode;
	@XmlElement(name="lng")
	public double lng;
	@XmlElement(name="lat")
	public double lat;
	@XmlElement(name="adminCode1")
	public String adminCode1;
	@XmlElement(name="adminName1")
	public String adminName1;
	@XmlElement(name="adminCode2")
	public String adminCode2;
	@XmlElement(name="adminName2")
	public String adminName2;
	@XmlElement(name="adminCode3")
	public String adminCode3;
	@XmlElement(name="adminName3")
	public String adminName3;
	@XmlElement(name="adminCode4")
	public String adminCode4;
	@XmlElement(name="adminName4")
	public String adminName4;
	@XmlElement(name="countryCode")
	public String countryCode;
	
	public void setStreet(String street) {
		this.street = street;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public void setAdminCode1(String adminCode1) {
		this.adminCode1 = adminCode1;
	}
	public void setAdminName1(String adminName1) {
		this.adminName1 = adminName1;
	}
	public void setAdminCode2(String adminCode2) {
		this.adminCode2 = adminCode2;
	}
	public void setAdminName2(String adminName2) {
		this.adminName2 = adminName2;
	}
	public void setAdminCode3(String adminCode3) {
		this.adminCode3 = adminCode3;
	}
	public void setAdminName3(String adminName3) {
		this.adminName3 = adminName3;
	}
	public void setAdminCode4(String adminCode4) {
		this.adminCode4 = adminCode4;
	}
	public void setAdminName4(String adminName4) {
		this.adminName4 = adminName4;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
	

}

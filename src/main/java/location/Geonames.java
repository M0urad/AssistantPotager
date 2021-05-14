package location;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="geonames")
public class Geonames {
	
	@XmlElement(name="address")
	public Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

}

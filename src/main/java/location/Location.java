package location;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Location {
	
	static double change(double value, int decimalpoint)
	{

		// Using the pow() method
		value = value * Math.pow(10, decimalpoint);
		value = Math.floor(value);
		value = value / Math.pow(10, decimalpoint);

		return value;
	}

	public static double[] Url() {

		String ville= "Paris";
		
		double[] location= {0,0};
		double lng;
		double lat;

		JAXBContext jaxbContext;
		try
		{	
			//URL url = new URL("http://api.geonames.org/geoCodeAddress?q="+ville+"&username=groupecrazy");
			//&countryCode=FR => pour rajouter la condition du pays
			URL url = new URL("http://api.geonames.org/geoCodeAddress?q="+ville+"&countryCode=FR&username=groupecrazy");

			BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));

			jaxbContext = JAXBContext.newInstance(Geonames.class);              

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Geonames geonames = (Geonames) jaxbUnmarshaller.unmarshal(read);

			lng=geonames.address.lng;
			lat=geonames.address.lat;

			lng=change(lng, 2);
			lat=change(lat, 2);
			
			location[0]=lng;
			location[1]=lat;

			System.out.println(lng);
			System.out.println(lat);

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return location;

	}


	public static void main(String[] args) {
	}


}

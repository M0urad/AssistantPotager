package meteo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import location.Location;

public class valeurs {
	
	public static List<meteo.level> a=new ArrayList();
	public static List<meteo.level> nebu=new ArrayList();
	public static List<meteo.level> humi=new ArrayList();
	public static List<meteo.level> ventmoy=new ArrayList();
	public static List<meteo.level> ventraf=new ArrayList();
	public static List<meteo.level> pression=new ArrayList();






	public static String inputStreamToString(InputStream is) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    String line;
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	    while ((line = br.readLine()) != null) {
	        sb.append(line);
	    }
	    br.close();
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		
		//File file = new File("Previsions.xml");
		
		JAXBContext jaxbContext;
		try
		{	
			//URL url = new URL("https://www.infoclimat.fr/public-api/gfs/xml?_ll=47.79,3.94&_auth=BR9RRgZ4ASNVeAM0D3kHLlM7BjNaLFdwVioKaQtuVyoJYgBhAWFQNgRqVCkCLQA2BSgGZQgzATEBalEpXy1SMwVvUT0GbQFmVToDZg8gByxTfQZnWnpXcFY9Cm8LeFcyCW4AegFjUDMEaVQoAjoANgUpBnkINgE%2FAWBRNl80UjcFYFEyBmQBYVUlA34POQczU2kGb1pjV2ZWMAplC2ZXYAliADABY1A0BHVUNwIyADIFNwZmCD8BOQFmUSlfLVJIBRVRKAYlASFVbwMnDyIHZlM%2BBjI%3D&_c=084159b6124d9f9e962e02ed071b21a9");
			URL url = new URL("https://www.infoclimat.fr/public-api/gfs/xml?_ll="+Location.Url()[1]+","+Location.Url()[0]+"&_auth=BR9RRgZ4ASNVeAM0D3kHLlM7BjNaLFdwVioKaQtuVyoJYgBhAWFQNgRqVCkCLQA2BSgGZQgzATEBalEpXy1SMwVvUT0GbQFmVToDZg8gByxTfQZnWnpXcFY9Cm8LeFcyCW4AegFjUDMEaVQoAjoANgUpBnkINgE%2FAWBRNl80UjcFYFEyBmQBYVUlA34POQczU2kGb1pjV2ZWMAplC2ZXYAliADABY1A0BHVUNwIyADIFNwZmCD8BOQFmUSlfLVJIBRVRKAYlASFVbwMnDyIHZlM%2BBjI%3D&_c=084159b6124d9f9e962e02ed071b21a9");
		    
			BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
		    
			jaxbContext = JAXBContext.newInstance(meteo.previsions.class);              
		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		    meteo.previsions previsions = (meteo.previsions) jaxbUnmarshaller.unmarshal(read);
		     
		    //System.out.println(previsions);
		    
		    //a=previsions.echeance.get(i).temperature.level.get(1).value;
		    
		    
		    
		    for(int i=0; i<64;i++) {
		    	
		    	a.add(previsions.echeance.get(i).temperature.level.get(0));
		    	nebu.add(previsions.echeance.get(i).nebulosite.level.get(3));
		    	humi.add(previsions.echeance.get(i).humidite.level.get(0));
		    	ventmoy.add(previsions.echeance.get(i).vent_moyen.level.get(0));
		    	ventraf.add(previsions.echeance.get(i).vent_rafales.level);
		    	pression.add(previsions.echeance.get(i).pression.level);



		    	System.out.println(a.get(i).value-273.15);
		    }
		    //System.out.println(a-273.15);
		}
		catch (Exception e) 
		{
		    e.printStackTrace();
		}

		
	}

}
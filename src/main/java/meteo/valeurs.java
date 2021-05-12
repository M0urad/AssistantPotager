package meteo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class valeurs {

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
		File file = new File("Previsions.xml");
		
		JAXBContext jaxbContext;
		try
		{	
			jaxbContext = JAXBContext.newInstance(meteo.previsions.class);              
		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		    meteo.previsions previsions = (meteo.previsions) jaxbUnmarshaller.unmarshal(file);
		     
		    System.out.println(previsions);
		    
//		    double a;
//		    a=previsions.echeance.get(0).temperature.level.get(0).value;
//		    System.out.println(a-273.15);
		}
		catch (JAXBException e) 
		{
		    e.printStackTrace();
		}

		
	}

}
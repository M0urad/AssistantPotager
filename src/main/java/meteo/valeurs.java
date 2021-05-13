package meteo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class valeurs {
	
	public static List<meteo.level> a=new ArrayList();

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
		     
		    //System.out.println(previsions);
		    
		    //a=previsions.echeance.get(i).temperature.level.get(1).value;
		    
		    
		    
		    for(int i=0; i<64;i++) {
		    	
		    	a.add(previsions.echeance.get(i).temperature.level.get(0));
		    	System.out.println(a.get(i).value-273.15);
		    }
		    //System.out.println(a-273.15);
		}
		catch (JAXBException e) 
		{
		    e.printStackTrace();
		}

		
	}

}
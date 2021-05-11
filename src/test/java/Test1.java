package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import meteo.previsions;


public class Test1 {

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
		XmlMapper xmlMapper = new XmlMapper();
		try {
			//Lecture
			String xml = inputStreamToString(new FileInputStream(file));
			
			//ecriture
			//String xml = xmlMapper.writeValueAsString(new Personne("Abid","Jordan",28));
			
			 previsions p = xmlMapper.readValue(xml, previsions.class);
			  System.out.println(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
	}

}

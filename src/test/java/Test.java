package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import meteo.previsions;
import metier.Personne;

public class Test {	 

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

	//	public static void main(String[] args) throws Exception {
	//		URL url = new URL("https://www.infoclimat.fr/public-api/gfs/xml?_ll=48.85341,2.3488&_auth=BR9RRgZ4ASNVeAM0D3kHLlM7BjNaLFdwVioKaQtuVyoJYgBhAWFQNgRqVCkCLQA2BSgGZQgzATEBalEpXy1SMwVvUT0GbQFmVToDZg8gByxTfQZnWnpXcFY9Cm8LeFcyCW4AegFjUDMEaVQoAjoANgUpBnkINgE%2FAWBRNl80UjcFYFEyBmQBYVUlA34POQczU2kGb1pjV2ZWMAplC2ZXYAliADABY1A0BHVUNwIyADIFNwZmCD8BOQFmUSlfLVJIBRVRKAYlASFVbwMnDyIHZlM%2BBjI%3D&_c=084159b6124d9f9e962e02ed071b21a9");
	//	    BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
	//	        
	//		File file = new File("previsions.xml");
	//		XmlMapper xmlMapper = new XmlMapper();
	//		try {
	//			//Lecture
	//			
	//			String xml = inputStreamToString(new FileInputStream(file));
	//			//String xml = read.toString();
	//			
	//			//ecriture
	//			//String xml = xmlMapper.writeValueAsString(new Personne("Abid","Jordan",28));
	//			
	//			 Personne p = xmlMapper.readValue(xml, Personne.class);
	//			  System.out.println(p);
	//		} catch (Exception e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		} 
	//		
	//	}

	public static void main(String[] args) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(previsions.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		previsions previsions = (previsions) jaxbUnmarshaller.unmarshal(new File("D:\\Users\\thomas\\eclipse-workspace\\meteoPower\\src\\main\\java\\xml"));
		System.out.println(previsions);
		////		String xml=HTTPLoader.getTextFile("https://www.infoclimat.fr/public-api/gfs/xml?_ll=48.85341,2.3488&_auth=BR9RRgZ4ASNVeAM0D3kHLlM7BjNaLFdwVioKaQtuVyoJYgBhAWFQNgRqVCkCLQA2BSgGZQgzATEBalEpXy1SMwVvUT0GbQFmVToDZg8gByxTfQZnWnpXcFY9Cm8LeFcyCW4AegFjUDMEaVQoAjoANgUpBnkINgE%2FAWBRNl80UjcFYFEyBmQBYVUlA34POQczU2kGb1pjV2ZWMAplC2ZXYAliADABY1A0BHVUNwIyADIFNwZmCD8BOQFmUSlfLVJIBRVRKAYlASFVbwMnDyIHZlM%2BBjI%3D&_c=084159b6124d9f9e962e02ed071b21a9");
		////		XmlMapper xmlMapper = new XmlMapper();
		////		try {
		////			//Lecture
		////			//String xml = inputStreamToString(new FileInputStream(file));
		////			
		////			//URL url = new URL("https://www.infoclimat.fr/public-api/gfs/xml?_ll=48.85341,2.3488&_auth=BR9RRgZ4ASNVeAM0D3kHLlM7BjNaLFdwVioKaQtuVyoJYgBhAWFQNgRqVCkCLQA2BSgGZQgzATEBalEpXy1SMwVvUT0GbQFmVToDZg8gByxTfQZnWnpXcFY9Cm8LeFcyCW4AegFjUDMEaVQoAjoANgUpBnkINgE%2FAWBRNl80UjcFYFEyBmQBYVUlA34POQczU2kGb1pjV2ZWMAplC2ZXYAliADABY1A0BHVUNwIyADIFNwZmCD8BOQFmUSlfLVJIBRVRKAYlASFVbwMnDyIHZlM%2BBjI%3D&_c=084159b6124d9f9e962e02ed071b21a9");
		////			//String xml = inputStreamToString(url.openStream());
		////			//ecriture
		////			//String xml = xmlMapper.writeValueAsString(new Personne("Abid","Jordan",28));
		////			
		////			System.out.println(xml);
		////			// reader.close();
		////			
		////			//previsions p = xmlMapper.readValue(xml, previsions.class);
		////			 //System.out.println(p);
		////		} catch (Exception e) {
		////			// TODO Auto-generated catch block
		////			e.printStackTrace();
		////		} 
		//		String xml=HTTPLoader.getTextFile("https://www.infoclimat.fr/public-api/gfs/xml?_ll=48.85341,2.3488&_auth=BR9RRgZ4ASNVeAM0D3kHLlM7BjNaLFdwVioKaQtuVyoJYgBhAWFQNgRqVCkCLQA2BSgGZQgzATEBalEpXy1SMwVvUT0GbQFmVToDZg8gByxTfQZnWnpXcFY9Cm8LeFcyCW4AegFjUDMEaVQoAjoANgUpBnkINgE%2FAWBRNl80UjcFYFEyBmQBYVUlA34POQczU2kGb1pjV2ZWMAplC2ZXYAliADABY1A0BHVUNwIyADIFNwZmCD8BOQFmUSlfLVJIBRVRKAYlASFVbwMnDyIHZlM%2BBjI%3D&_c=084159b6124d9f9e962e02ed071b21a9");
		//		
		//		
		//		System.out.println(xml);
		//		
	}
	//	
	//	
	//	
	//	
	//	
	//
}

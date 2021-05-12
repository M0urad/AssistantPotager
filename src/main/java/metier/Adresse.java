package metier;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import com.sun.xml.txw2.annotation.XmlCDATA;
import com.sun.xml.txw2.annotation.XmlValue;


@XmlRootElement(name = "adresse")

public class Adresse {

	
	@XmlElement(name = "num")
	private int num;
	@XmlElement(name = "rue")
	private String rue;
	private String typeAdresse;
	
	public Adresse() {
	}

	

	public Adresse(int num, String rue, String toto) {
		super();
		this.num = num;
		this.rue = rue;
		
		this.typeAdresse = toto;
	}



	public String getToto() {
		return typeAdresse;
	}



	public void setToto(String toto) {
		this.typeAdresse = toto;
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}



	@Override
	public String toString() {
		return "Adresse [num=" + num + ", rue=" + rue + ", typeAdresse=" + typeAdresse + "]";
	}


	
}

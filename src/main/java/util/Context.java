package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Context {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("eshopModel");

	
	private static Context _instance;
	
	
	private Context() {}
	


	public static Context get_instance() {
		if(_instance==null) 
		{
			_instance=new Context();
		}
		return _instance;
	}


	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
}

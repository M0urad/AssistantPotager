package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOCompte;
import dao.DAOMaPlante;
import dao.DAOMeteo;
import dao.DAOPlante;


public class Context {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("potagerJPA");

	private DAOPlante daoP = new DAOPlante();
	private DAOCompte daoC = new DAOCompte();
	private DAOMeteo daoM = new DAOMeteo();
	private DAOMaPlante daoMP = new DAOMaPlante();

	
	private static Context _instance;
	
	
	private Context() {}
	


	public static Context get_instance() {
		if(_instance==null) 
		{
			_instance=new Context();
		}
		return _instance;
	}


	public DAOPlante getDaoP() {
		return daoP;
	}



	public DAOCompte getDaoC() {
		return daoC;
	}



	public DAOMeteo getDaoM() {
		return daoM;
	}
	
	
	public DAOMaPlante getDaoMP() {
		return daoMP;
	}



	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
}

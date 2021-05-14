package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.boot.model.source.spi.EmbeddableSource;

import util.Context;

public class DAOMeteo implements IDAO<Meteo,Integer> {

	@Override
	public Meteo findById(int id) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Meteo meteo = em.find(Meteo.class, id);
		em.close();
		return meteo;
	}

	@Override
	public List<Meteo> findAll() {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT m from Meteo m",Meteo.class);
		List<Meteo> meteos=myQuery.getResultList();
		em.close();
		return meteos;
	}

	@Override
	public Meteo save(Meteo meteo) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		meteo = em.merge(meteo);
		em.getTransaction().commit();

		em.close();		
		return meteo;
	}
	
	@Override
	public List<Meteo> saveAll(List<Meteo> meteos) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		for (Meteo m : meteos) {
		em.getTransaction().begin();
		m = em.merge(m);
		em.getTransaction().commit();
		}
		em.close();		
		return meteos;
	}

	@Override
	public void delete(Meteo meteo) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		meteo = em.merge(meteo);
		em.remove(meteo);
		em.getTransaction().commit();

		em.close();
	}

	@Override
	public void add(Meteo entity) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		
	}


}

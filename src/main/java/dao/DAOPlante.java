package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import plante.MaPlante;
import plante.Plante;
import util.Context;

public class DAOPlante implements IDAO<Plante, Integer> {
	
	@Override
	public void add(Plante entity) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		
	}


	@Override
	public Plante findById(int id) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Plante plante = em.find(Plante.class, id);
		em.close();
		return plante;
	}

	@Override
	public List<Plante> findAll() {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT m from Plante m",Plante.class);
		List<Plante> plantes=myQuery.getResultList();
		em.close();
		return plantes;
	}

	@Override
	public Plante save(Plante plante) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		plante = em.merge(plante);
		em.getTransaction().commit();

		em.close();		
		return plante;
	}


	@Override
	public List<Plante> saveAll(List<Plante> plantes) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		for (Plante p : plantes) {
			em.getTransaction().begin();
			p = em.merge(p);
			em.getTransaction().commit();
		}
		em.close();		
		return plantes;
	}

	@Override
	public void delete(Plante plante) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		plante = em.merge(plante);
		em.remove(plante);
		em.getTransaction().commit();

		em.close();
	}


	@Override
	public List<MaPlante> findAllByUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MaPlante> findAllSpeciesByUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

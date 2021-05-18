package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Compte;
import plante.MaPlante;
import util.Context;

public class DAOMaPlante implements IDAO<MaPlante, Integer> {
	
	@Override
	public void add(MaPlante entity) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		
	}


	@Override
	public MaPlante findById(int id) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		MaPlante plante = em.find(MaPlante.class, id);
		em.close();
		return plante;
	}

	@Override
	public List<MaPlante> findAll() {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT m from MaPlante m",MaPlante.class);
		List<MaPlante> plantes=myQuery.getResultList();
		em.close();
		return plantes;
	}
	
	@Override
	public List<MaPlante> findAllByUser(int id) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT m from MaPlante m where compte_id ="+id ,MaPlante.class);
		List<MaPlante> plantes=myQuery.getResultList();
		em.close();
		return plantes;
	}
	
	@Override
	public List<MaPlante> findAllSpeciesByUser(int id) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT distinct plante_id from MaPlante plante_id where compte_id ="+id ,MaPlante.class);
		List<MaPlante> plantes=myQuery.getResultList();
		em.close();
		return plantes;
	}

	@Override
	public MaPlante save(MaPlante plante) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		plante = em.merge(plante);
		em.getTransaction().commit();

		em.close();		
		return plante;
	}


	@Override
	public List<MaPlante> saveAll(List<MaPlante> plantes) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		for (MaPlante p : plantes) {
			em.getTransaction().begin();
			p = em.merge(p);
			em.getTransaction().commit();
		}
		em.close();		
		return plantes;
	}

	@Override
	public void delete(MaPlante plante) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		plante = em.merge(plante);
		em.remove(plante);
		em.getTransaction().commit();

		em.close();
	}

}

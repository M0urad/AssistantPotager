package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Compte;
import plante.MaPlante;
import util.Context;

public class DAOCompte implements IDAO<Compte, Integer> {

	@Override
	public void add(Compte compte) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(compte);
		em.getTransaction().commit();
		em.close();

		}
	
	
	@Override
	public Compte findById(int id) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Compte compte = em.find(Compte.class, id);
		em.close();
		return compte;
	}
	
//	public Compte findByLogin(String login) {
//		EntityManager em = Context.get_instance().getEmf().createEntityManager();
//		Compte compte = em.find(Compte.class ,);
//		em.close();
//		return compte;
//	}

	@Override
	public List<Compte> findAll() {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT c from Compte c",Compte.class);
		List<Compte> comptes=myQuery.getResultList();
		em.close();
		return comptes;
	}

	@Override
	public Compte save(Compte compte) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		compte = em.merge(compte);
		em.getTransaction().commit();

		em.close();		
		return compte;
	}
	
	@Override
	public List<Compte> saveAll(List<Compte> comptes) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		for (Compte c : comptes) {
		em.getTransaction().begin();
		c = em.merge(c);
		em.getTransaction().commit();
		}
		em.close();		
		return comptes;
	}

	@Override
	public void delete(Compte compte) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		compte = em.merge(compte);
		em.remove(compte);
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

package dao;

import java.util.List;

import plante.MaPlante;

public interface IDAO<T,K> {

		
		public T findById(int id); 
		public List<T> findAll();
		public T save(T entity);
		public void delete(T entity);
		public List<T> saveAll(List<T> entity);
		void add(T entity);
		List<MaPlante> findAllByUser(int id);

}

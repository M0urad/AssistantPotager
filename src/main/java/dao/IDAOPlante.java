package dao;

public interface IDAOPlante<T,K> extends IDAO {
	
	public T findByNom(int id); 

}

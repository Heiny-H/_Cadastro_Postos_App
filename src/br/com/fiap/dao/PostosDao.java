package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.model.ListaPostos;

public class PostosDao {

	EntityManager manager = JpaManager.getManager();
	
	public void inserir(ListaPostos postos) {
			
			manager.getTransaction().begin();
			manager.persist(postos);
			manager.getTransaction().commit();	
	}
	
	public List<ListaPostos> listarTodos() {
		TypedQuery<ListaPostos> query = 
				manager.createQuery("SELECT l FROM ListaPostos l", ListaPostos.class);
		return query.getResultList();

	}
	
	public void apagar(ListaPostos postos) {
		manager.getTransaction().begin();
		manager.remove(postos);
		manager.getTransaction().commit();
	}

	public void apagar(Long id) {
		apagar(buscarPorId(id));
	}

	public ListaPostos buscarPorId(Long id) {
		return manager.find(ListaPostos.class, id);
	}
		
}

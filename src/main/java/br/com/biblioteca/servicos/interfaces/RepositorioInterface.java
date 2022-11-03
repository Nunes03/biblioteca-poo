package main.java.br.com.biblioteca.servicos.interfaces;

import java.util.List;

public interface RepositorioInterface<E> {
	
	Boolean criar(E entity);

	Boolean atualizar(E entity);
	
	E buscarPorId(Integer id);
	
	List<E> buscarTodos();
	
	Boolean deletarTodos();
	
	Boolean deletarPorId(Integer id);
}
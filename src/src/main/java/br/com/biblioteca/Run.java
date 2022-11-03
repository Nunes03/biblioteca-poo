package main.java.br.com.biblioteca;

import java.util.Date;

import main.java.br.com.biblioteca.entities.ClienteEntity;
import main.java.br.com.biblioteca.repositories.ClienteRepository;
import main.java.br.com.biblioteca.repositories.interfaces.ClienteRepositoryInterface;

public class Run {

	public static void main(String[] args) {
		ClienteEntity clienteEntity = new ClienteEntity(
			1,
			"Lucas Nunes",
			new Date(),
			"1546",
			"7845",
			null
		);
		
		ClienteRepositoryInterface clienteRepositoryInterface = new ClienteRepository();
		clienteRepositoryInterface.criar(clienteEntity);
	}
}
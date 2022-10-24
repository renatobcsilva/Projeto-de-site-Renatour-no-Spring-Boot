package br.com.renatour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renatour.model.Cliente;




public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
}

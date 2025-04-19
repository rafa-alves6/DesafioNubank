package spring.boot.desafio.Nubank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.desafio.Nubank.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
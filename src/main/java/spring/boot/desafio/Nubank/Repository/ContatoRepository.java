package spring.boot.desafio.Nubank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.desafio.Nubank.Model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}

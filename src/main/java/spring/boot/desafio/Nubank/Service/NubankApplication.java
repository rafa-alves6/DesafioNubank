package spring.boot.desafio.Nubank.Service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import spring.boot.desafio.Nubank.Repository.ClienteRepository;

@EntityScan("spring.boot.desafio.Nubank.Model")
@EnableJpaRepositories(basePackages = "spring.boot.desafio.Nubank.Repository")
@SpringBootApplication
public class NubankApplication {
	public static void main(String[] args) {
		SpringApplication.run(NubankApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepository) {
		return args -> {
			System.out.println(" Verificando criação de tabelas...");
			try {
				System.out.println("Total de clientes: " + clienteRepository.count());
			} catch (Exception e) {
				System.err.println("Erro ao acessar repositório: " + e.getMessage());
			}
		};
	}
}
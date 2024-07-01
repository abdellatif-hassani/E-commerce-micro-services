package hassani.abdellatif.clientsservice;

import hassani.abdellatif.clientsservice.entities.Client;
import hassani.abdellatif.clientsservice.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientsServiceApplication {
    private ClientRepository clientRepository;
    public static void main(String[] args) {
        SpringApplication.run(ClientsServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(null, "Hassani", "Hassani@gmail.com", "123456789"));
        };
    }
}

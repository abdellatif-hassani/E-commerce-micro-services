package hassani.abdellatif.clientsservice.repositories;

import hassani.abdellatif.clientsservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

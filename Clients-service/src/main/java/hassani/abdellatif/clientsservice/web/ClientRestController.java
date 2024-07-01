package hassani.abdellatif.clientsservice.web;

import hassani.abdellatif.clientsservice.entities.Client;
import hassani.abdellatif.clientsservice.repositories.ClientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientRestController {
    private ClientRepository clientRepository;

    public ClientRestController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //List all clients
    @GetMapping({"/", ""})
    public List<Client> getClients() {
        return this.clientRepository.findAll();
    }
}

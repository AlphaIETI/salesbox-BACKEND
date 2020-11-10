package edu.eci.ieti.salesbox.controllers;


import edu.eci.ieti.salesbox.exceptions.ClientException;
import edu.eci.ieti.salesbox.models.Client;
import edu.eci.ieti.salesbox.services.impl.ClientServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = {"https://salesbox-alpha.herokuapp.com","http://localhost:3000"})
public class ClientController {

    @Autowired
    ClientServicesImpl clientServicesImpl;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientServicesImpl.getAllCients();
    }

    @GetMapping("/clients/id/{id}")
    public Client getClientsById(@PathVariable("id") String id) throws ClientException {
        return clientServicesImpl.getClienteById(id);
    }

    @GetMapping("/clients/email/{email}")
    public Client getClientsByEmail(@PathVariable("email") String email) {
        return clientServicesImpl.getClienteByEmail(email);
    }

    @PutMapping("/clients")
    public Client updateClientsByEmail(@RequestBody Client newClient) {
        return clientServicesImpl.updateClientByEmail(newClient);
    }

    @DeleteMapping("/clients/email/{email}")
    public void deleteClientByEmail(@PathVariable("email") String email){
        clientServicesImpl.deleteClientByEmail(email);
    }
    @DeleteMapping("/clients/id/{id}")
    public void deleteClientById(@PathVariable("id") String id){
        clientServicesImpl.deleteClientById(id);
    }

    @PostMapping("/addClient")
    public Client insertClient(@RequestBody Client newClient ){
        UUID uuid=UUID.randomUUID();
        newClient.setId(uuid.toString());
        return clientServicesImpl.insertClient(newClient);
    }
}


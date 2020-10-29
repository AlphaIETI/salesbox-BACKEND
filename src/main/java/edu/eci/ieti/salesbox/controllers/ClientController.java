package edu.eci.ieti.salesbox.controllers;


import edu.eci.ieti.salesbox.models.Client;
import edu.eci.ieti.salesbox.services.impl.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = {"https://salesbox-alpha.herokuapp.com","http://localhost:3000"})
public class ClientController {

    @Autowired
    ClientServices clientServices;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientServices.getAllCients();
    }

    @GetMapping("/clients/id/{id}")
    public Client getClientsById(@PathVariable("id") String id) {
        return clientServices.getClienteById(id);
    }

    @GetMapping("/clients/email/{email}")
    public Client getClientsByEmail(@PathVariable("email") String email) {
        return clientServices.getClienteByEmail(email);
    }

    @PutMapping("/clients")
    public Client updateClientsByEmail(@RequestBody Client newClient) {
        return clientServices.updateClientByEmail(newClient);
    }

    @DeleteMapping("/clients/email/{email}")
    public boolean deleteClientByEmail(@PathVariable("email") String email){
        return clientServices.deleteClientByEmail(email);
    }
    @DeleteMapping("/clients/id/{id}")
    public void deleteClientById(@PathVariable("id") String id){
        clientServices.deleteClientById(id);
    }

    @PostMapping("/addClient")
    public Client insertClient(@RequestBody Client newClient ){
        UUID uuid=UUID.randomUUID();
        newClient.setId(uuid.toString());
        return clientServices.insertClient(newClient);
    }
}


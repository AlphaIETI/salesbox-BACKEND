package edu.eci.ieti.salesbox.controllers;


import edu.eci.ieti.salesbox.models.Client;
import edu.eci.ieti.salesbox.services.impl.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientServices clientServices;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientServices.getAllCients();
    }

    @GetMapping("/clients/id/{id}")
    public Client getClientsById(@PathVariable("id") int id) {
        return clientServices.getClienteById(id);
    }

    @GetMapping("/clients/mail/{mail}")
    public Client getClientsByMail(@PathVariable("mail") String mail) {
        return clientServices.getClienteByMail(mail);
    }

    @PutMapping("/clients/mail/{mail}")
    public Client updateClientsByMail(@RequestBody Client newClient, @PathVariable("mail") String mail) {
        return clientServices.updateClientByMail(newClient,mail);
    }

    @DeleteMapping("/clients/mail/{mail}")
    public boolean deleteClientByMail(@PathVariable("mail") String mail){
        return clientServices.deleteClientByMail(mail);
    }
    @DeleteMapping("/clients/id/{id}")
    public void deleteClientById(@PathVariable("id") int id){
        clientServices.deleteClientById(id);
    }
}

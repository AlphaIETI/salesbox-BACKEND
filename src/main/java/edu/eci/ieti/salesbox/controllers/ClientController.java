package edu.eci.ieti.salesbox.controllers;


import edu.eci.ieti.salesbox.models.Client;
import edu.eci.ieti.salesbox.services.impl.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
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
    public Client getClientsById(@PathVariable("mail") String mail) {
        return clientServices.getClienteByMail(mail);
    }

    @PutMapping("/clients/mail/{mail}")
    public Client updateClientsByMail(@RequestBody Client newClient, @PathVariable("mail") String mail) {
        // JSON {"id":"100","name":"juliana","lastname":"garzon","mail":juliana@hotmail.com,"password":"2222"}
        return clientServices.updateClientByMail(newClient,mail);
    }

    @DeleteMapping("/clients/mail/{mail}")
    public boolean deleteClientByMail(@PathVariable("mail") String mail){
        return clientServices.deleteClientByMail(mail);
    }
}

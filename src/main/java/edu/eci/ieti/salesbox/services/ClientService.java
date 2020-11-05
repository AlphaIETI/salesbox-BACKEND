package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.models.Client;

import java.util.List;

public interface ClientService {

    public Client getClienteById(String id);
    public Client getClienteByEmail(String email);
    public List<Client> getAllCients();
    public Client insertClient(Client newClient);
    public Client updateClientByEmail(Client newClient);
    public void deleteClientByEmail(String email);
    public void deleteClientById(String id);


}

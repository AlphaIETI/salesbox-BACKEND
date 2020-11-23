package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.exceptions.ClientException;
import edu.eci.ieti.salesbox.models.Client;

import java.util.List;

public interface ClientService {

    public Client getClientById(String id) throws ClientException;

    public Client getClientByEmail(String email) ;

    public List<Client> getAllClients() ;

    public Client insertClient(Client newClient) ;

    public Client updateClientByEmail(Client newClient) ;

    public void deleteClientByEmail(String email) ;

    public void deleteClientById(String id) ;


}

package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.exceptions.ClientException;
import edu.eci.ieti.salesbox.persistence.ClientRepository;
import edu.eci.ieti.salesbox.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.ieti.salesbox.models.Client;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class ClientServicesImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    /**
     * Method allowing to consult a client by its id.
     *
     * @param id This is a identifier of the client.
     * @return  Returns the client corresponding to the id.
     */
    @Override
    public Client getClienteById(String id) throws ClientException {
        return clientRepository.findById(id).orElseThrow(() -> new ClientException("The Client with the ID:" + id + " does not exist."));
    }

    /**
     * Method allowing to consult a client by its mail.
     *
     * @param email This is a mail of the client.
     * @return  Returns the client corresponding to the mail.
     */
    @Override
    public Client getClienteByEmail(String email){

        Optional<Client> optionalClient = clientRepository.findByEmail(email);
        return optionalClient.get();

    }

    /**
     * Method that allows to consult all the  clients.
     *
     * @return Returns all clients
     */
    @Override
    public List<Client> getAllCients(){

        return clientRepository.findAll();

    }

    /**
     * Method used to insert a new client.
     *
     * @param newClient This is the object that represents the new client
     * @return Return Client if the new client is inserted.
     */
    @Override
    public Client insertClient(Client newClient){

        return clientRepository.save(newClient);

    }

    /**
     * Method used to update an existing client.
     *
     * @param newClient This is the object that represents the update of the client.
     * @return Return the object that represents the updated client.
     */
    @Override
    public Client updateClientByEmail(Client newClient){

        return clientRepository.save(newClient);

    }

    /**
     * Method used to delete an existing client.
     *
     * @param email This is the mail of the client to be deleted.
     */
    @Override
    public void deleteClientByEmail(String email){

        Client client = getClienteByEmail(email);
        clientRepository.delete(client);

    }

    @Override
    public void deleteClientById(String id){

        Optional<Client> OC = clientRepository.findById(id);
        clientRepository.delete(OC.get());

    }
}

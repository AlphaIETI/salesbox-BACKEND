package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.persistence.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.ieti.salesbox.models.Client;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class ClientServices {

    @Autowired
    private ClientRepository clientRepository;
    /**
     * Method allowing to consult a client by its id.
     *
     * @param id This is a identifier of the client.
     * @return  Returns the client corresponding to the id.
     */
    public Client getClienteById(String id){
        Optional<Client> OC = clientRepository.findById(id);
        return OC.get();

    }

    /**
     * Method allowing to consult a client by its mail.
     *
     * @param email This is a mail of the client.
     * @return  Returns the client corresponding to the mail.
     */
    public Client getClienteByEmail(String email){
        Optional<Client> optionalClient = clientRepository.findByEmail(email);
        return optionalClient.get();
    }

    /**
     * Method that allows to consult all the  clients.
     *
     * @return Returns all clients
     */
    public List<Client> getAllCients(){
        return clientRepository.findAll();
    }

    /**
     * Method used to insert a new client.
     *
     * @param newClient This is the object that represents the new client
     * @return Return Client if the new client is inserted.
     */
    public Client insertClient(Client newClient){
        return clientRepository.save(newClient);
    }

    /**
     * Method used to update an existing client.
     *
     * @param newClient This is the object that represents the update of the client.
     * @return Return the object that represents the updated client.
     */
    public Client updateClientByEmail(Client newClient, String email){
        Client answ = null;
        for (Client cli:clientRepository.findAll()){
            if (cli.getEmail().equals(email)){
                cli.setName(newClient.getName());
                cli.setLastname(newClient.getLastname());
                cli.setEmail(newClient.getEmail());
                cli.setPassword(newClient.getPassword());
                cli.setCoupons(newClient.getCoupons());
                cli.setPhone(newClient.getPhone());
                cli.setAddress(newClient.getAddress());
                cli.setAge(newClient.getAge());
                cli.setSizeUp(newClient.getSizeUp());
                cli.setSizeDown(newClient.getSizeDown());
                cli.setShoeSize(newClient.getShoeSize());
                cli.setCart(newClient.getCart());
                cli.setFavorites(newClient.getFavorites());

                answ = cli;
                clientRepository.delete(answ);
                clientRepository.save(answ);
            }
        }
        return answ;
    }

    /**
     * Method used to delete an existing client.
     *
     * @param email This is the mail of the client to be deleted.
     * @return  Return true or false if the client is removed.
     */
    public boolean deleteClientByEmail(String email){
        boolean flag = false;
        int position = -1;
        for (Client cli:clientRepository.findAll()) {
            if (cli.getEmail().equals(email)) {
                clientRepository.delete(cli);
            }
        }
        return flag;
    }

    public void deleteClientById(String id){
        Optional<Client> OC = clientRepository.findById(id);
        clientRepository.delete(OC.get());
    }
}

package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Product;
import edu.eci.ieti.salesbox.persistence.ClientRepository;
import edu.eci.ieti.salesbox.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.ieti.salesbox.models.Client;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import edu.eci.ieti.salesbox.persistence.ClientRepository;

@Service
public class ClientServices {

    // ClientsArrayTest
    private static ArrayList<Client> clientsTest = new ArrayList<> (Arrays.asList(new Client(1,"Sergio","Nuñez","Sergio@hotmail.com","1234"),
            new Client(2,"David","Diaz","David@hotmail.com","0000"),
            new Client(3,"Juan","Navarro","Juan@hotmail.com","1111")));

    @Autowired
    private ClientRepository clientRepository;
    /**
     * Method allowing to consult a client by its id.
     *
     * @param id This is a identifier of the client.
     * @return  Returns the client corresponding to the id.
     */
    public Client getClienteById(int id){
        Optional<Client> OC = clientRepository.findById(id);
        return OC.get();

    }

    /**
     * Method allowing to consult a client by its mail.
     *
     * @param mail This is a mail of the client.
     * @return  Returns the client corresponding to the mail.
     */
    public Client getClienteByMail(String mail){
        Client answ = null;
        for (Client cli:clientRepository.findAll()){
            if (cli.getmail().equals(mail)){
                answ = cli;
            }
        }
        return answ;
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
     * @param cli This is the object that represents the new client
     * @return Return Client if the new client is inserted.
     */
    public Client insertClient(Client cli){
        return clientRepository.save(cli);
    }

    /**
     * Method used to update an existing client.
     *
     * @param newClient This is the object that represents the update of the client.
     * @param mail  This is the mail of the promotion to be updated.
     * @return Return the object that represents the updated client.
     */
    public Client updateClientByMail(Client newClient,String mail){
        Client answ = null;
        for (Client cli:clientRepository.findAll()){
            if (cli.getmail().equals(mail)){
                cli.setname(newClient.getname());
                cli.setlastname(newClient.getlastname());
                cli.setmail(newClient.getmail());
                cli.setpassword(newClient.getpassword());
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
     * @param mail This is the mail of the client to be deleted.
     * @return  Return true or false if the client is removed.
     */
    public boolean deleteClientByMail(String mail){
        boolean flag = false;
        int position = -1;
        for (Client cli:clientRepository.findAll()) {
            if (cli.getmail().equals(mail)) {
                clientRepository.delete(cli);
            }
        }
        return flag;
    }

    public void deleteClientById(int id){
        Optional<Client> OC = clientRepository.findById(id);
        clientRepository.delete(OC.get());
    }
}

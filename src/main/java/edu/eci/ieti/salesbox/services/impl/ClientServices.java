package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.services.Services;
import org.springframework.stereotype.Service;
import edu.eci.ieti.salesbox.models.Client;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientServices {

    // ClientsArrayTest
    private static ArrayList<Client> clientsTest = new ArrayList<> (Arrays.asList(new Client(1,"Sergio","Nuñez","Sergio@hotmail.com","1234"),
            new Client(2,"David","Diaz","David@hotmail.com","0000"),
            new Client(3,"Juan","Navarro","Juan@hotmail.com","1111")));

    /**
     * Method allowing to consult a client by its id.
     *
     * @param id This is a identifier of the client.
     * @return  Returns the client corresponding to the id.
     */
    public Client getClienteById(int id){
        Client answ = null;
        for (Client cli:clientsTest){
            if (cli.getId() == id){
                answ = cli;
            }
        }
        return answ;
    }

    /**
     * Method allowing to consult a client by its mail.
     *
     * @param mail This is a mail of the client.
     * @return  Returns the client corresponding to the mail.
     */
    public Client getClienteByMail(String mail){
        Client answ = null;
        for (Client cli:clientsTest){
            if (cli.getmail() == mail){
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
        return clientsTest;
    }

    /**
     * Method used to insert a new client.
     *
     * @param cli This is the object that represents the new client
     * @return Return true or false if the new client is inserted.
     */
    public boolean insertClient(Client cli){
        boolean flag = false;
        if (cli != null){
            clientsTest.add(cli);
            flag = true;
        }
        return flag;
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
        for (Client cli:clientsTest){
            if (cli.getmail() == mail){
                cli.setname(newClient.getname());
                cli.setlastname(newClient.getlastname());
                cli.setmail(newClient.getmail());
                cli.setpassword(newClient.getpassword());
                answ = cli;
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
        for (Client cli:clientsTest) {
            if (cli.getmail() == mail) {
                position = clientsTest.indexOf(cli);
            }
        }
        if (position >=0){
            clientsTest.remove(position);
            flag = true;
        }
        return flag;
    }
}
package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Entity;
import edu.eci.ieti.salesbox.services.EntityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class EntityServiceImpl implements EntityService {

    List<Entity> entities = new ArrayList<Entity>(Arrays.asList(new Entity("1","JGD","123","abc@gmail.com","1234","123","Bogota","cra12#1-2"),
            new Entity("2","DDD","345","ddd@gmail.com","12344","998123","Cali","calle 6#1-2"),
            new Entity("3","ADD","678","add@gmail.com","12341","127873","Bucaramanga","av 127#1-2")));



    @Override
    public List<Entity> getAllEntities() {
        return entities;
    }

    @Override
    public Entity getEntityById(String id) {
        Entity res=null;
        for(int i=0 ;i<entities.size();i++){
            if (entities.get(i).getId().equals(id)){
                res= entities.get(i);
            }
        }
        return res;
    }

    @Override
    public Entity getEntityByName(String name) {
        Entity res=null;
        for(int i=0 ;i<entities.size();i++){
            if (entities.get(i).getName().equals(name)){
                res= entities.get(i);
            }
        }
        return res;
    }

    @Override
    public Entity getEntityByEmail(String email) {
        Entity res=null;
        for(int i=0 ;i<entities.size();i++){
            if (entities.get(i).getEmail().equals(email)){
                res= entities.get(i);
            }
        }
        return res;
    }

    @Override
    public Entity createEntity(Entity newEntity) {
        entities.add(newEntity);
        return newEntity;
    }

    public Entity updateEntity(Entity newEntity) {
        return null;
    }


    @Override
    public void removeEntity(String id) {
        for(int i=0 ;i<entities.size();i++){
            if (entities.get(i).getId().equals(id)){
                entities.remove(entities.get(i));
            }
        }

    }
}

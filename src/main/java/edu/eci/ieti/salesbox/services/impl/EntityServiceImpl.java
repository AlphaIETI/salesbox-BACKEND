package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Entity;
import edu.eci.ieti.salesbox.persistence.EntityRepository;
import edu.eci.ieti.salesbox.services.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EntityServiceImpl implements EntityService {

   /*List<Entity> entities = new ArrayList<Entity>(Arrays.asList(new Entity("1","JGD","123","abc@gmail.com","1234","123","Bogota","cra12#1-2"),
            new Entity("2","DDD","345","ddd@gmail.com","12344","998123","Cali","calle 6#1-2"),
            new Entity("3","ADD","678","add@gmail.com","12341","127873","Bucaramanga","av 127#1-2")));*/

  @Autowired
  private EntityRepository er;

    @Override
    public List<Entity> getAllEntities() {
        return er.findAll();
    }

    @Override
    public Entity getEntityById(String id) {
        Optional<Entity> optionalEntity= er.findById(id);
        return optionalEntity.get();
    }

    @Override
    public Entity getEntityByName(String name) {
        Optional<Entity> optionalEntity= er.findByName(name);
        return optionalEntity.get();
    }

    @Override
    public Entity getEntityByEmail(String email) {
        Optional<Entity> optionalEntity= er.findByEmail(email);
        return optionalEntity.get();
    }

    @Override
    public Entity createEntity(Entity newEntity) {
        return er.save(newEntity);
    }
    @Override
    public Entity updateEntity(Entity newEntity) {
        return null;
    }


    @Override
    public void removeEntity(String id) {
      er.delete(er.findById(id).get());

    }
}

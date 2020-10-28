package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.exceptions.EntityException;
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
    public Entity getByEmailAndPassword(String email, String password) {
        return er.findByEmailAndPassword(email,password).get();
    }


    @Override
    public void removeEntity(String id) {
      er.delete(er.findById(id).get());

    }
}

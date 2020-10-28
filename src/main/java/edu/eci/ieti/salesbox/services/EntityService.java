package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.exceptions.EntityException;
import edu.eci.ieti.salesbox.models.Entity;

import java.util.List;

public interface EntityService {

    public List<Entity> getAllEntities() throws EntityException;
    public Entity getEntityById(String id) throws EntityException;
    public Entity getEntityByName(String name) throws EntityException;
    public Entity getEntityByEmail(String email) throws EntityException;
    public Entity createEntity(Entity newEntity) throws EntityException;
    public Entity updateEntity(Entity newEntity) throws EntityException;
    public Entity getByEmailAndPassword(String email,String password) throws EntityException;
    public void removeEntity(String id) throws EntityException;


}


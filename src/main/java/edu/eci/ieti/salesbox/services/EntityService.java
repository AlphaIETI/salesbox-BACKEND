package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.models.Entity;

import java.util.List;

public interface EntityService {

    public List<Entity> getAllEntities();
    public Entity getEntityById(String id);
    public Entity getEntityByName(String name);
    public Entity getEntityByEmail(String email);
    public Entity createEntity(Entity newEntity);
    public Entity updateEntity(Entity newEntity);
    public void removeEntity(String id);


}

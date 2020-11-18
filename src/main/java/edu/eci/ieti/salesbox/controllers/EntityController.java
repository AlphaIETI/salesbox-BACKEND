package edu.eci.ieti.salesbox.controllers;


import edu.eci.ieti.salesbox.exceptions.EntityException;
import edu.eci.ieti.salesbox.models.Entity;
import edu.eci.ieti.salesbox.services.EntityService;
import edu.eci.ieti.salesbox.services.impl.EntityServiceImpl;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = {"https://salesbox-alpha.herokuapp.com","http://localhost:3000"})
public class EntityController {
    @Autowired
    EntityServiceImpl es;

    @GetMapping("/entities")
    List<Entity> getAllEntities(){
        return es.getAllEntities();
    }

    @GetMapping("/entity/id/{id}")
    Entity getEntityById(@PathVariable String id){
        return es.getEntityById(id);
    }

    @GetMapping("/entity/name/{name}")
    Entity getEntityByName(@PathVariable String name){
        return es.getEntityByName(name);
    }


    @GetMapping("/entity/user/{email}/{password}")
    Entity getByEmailAndPassword(@PathVariable String email, @PathVariable String password) throws EntityException {
        return es.getByEmailAndPassword(email,password);
    }
    @GetMapping("/entity/user/{email}")
    Entity getEntityByEmail(@PathVariable String email){
        return es.getEntityByEmail(email);
    }

    @PostMapping("/entities")

    Entity createEntity(@RequestBody Entity newEntity){
        UUID uuid=UUID.randomUUID();
        newEntity.setId(uuid.toString());
        return es.createEntity(newEntity);
    }

    @PutMapping("/entities")
    Entity editEntity(@RequestBody Entity putEntity){
        return es.createEntity(putEntity);
    }
    
    @DeleteMapping("/entitydel/{id}")
    void deleteUser(@PathVariable String id){
        es.removeEntity(id);

    }
}

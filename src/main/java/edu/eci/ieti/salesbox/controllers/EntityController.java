package edu.eci.ieti.salesbox.controllers;


import edu.eci.ieti.salesbox.models.Entity;
import edu.eci.ieti.salesbox.services.EntityService;
import edu.eci.ieti.salesbox.services.impl.EntityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
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


    @GetMapping("/entity/user/{email}")
    Entity getEntityByEmail(@PathVariable String email){
        return es.getEntityByEmail(email);
    }

    @PostMapping("/entities")

    Entity createEntity(@RequestBody Entity newEntity){
        return es.createEntity(newEntity);
    }

    @DeleteMapping("/entitydel/{id}")
    void deleteUser(@PathVariable String id){
        es.removeEntity(id);

    }
}

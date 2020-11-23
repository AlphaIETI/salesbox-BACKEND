package edu.eci.ieti.salesbox.controllers;

import edu.eci.ieti.salesbox.exceptions.OrderException;
import edu.eci.ieti.salesbox.models.Order;
import edu.eci.ieti.salesbox.services.impl.OrderServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = {"https://salesbox-alpha.herokuapp.com","http://localhost:3000"})
public class OrderController {

    @Autowired
    OrderServicesImpl orderServicesImpl;

    @GetMapping("/orders")
    public List<Order> getAllOrders(){

        return orderServicesImpl.getAllOrders();

    }

    @GetMapping("/orders/id/{id}")
    public Order getOrderById(@PathVariable("id") String id) throws OrderException {

        return orderServicesImpl.getOrderById(id);

    }

    @DeleteMapping("/orders/id/{id}")
    public void deleteOrderById(@PathVariable("id") String id){

        orderServicesImpl.deleteOrderById(id);

    }

    @PostMapping("/addOrder")
    public Order insertOrder(@RequestBody Order newOrder ){

        UUID uuid=UUID.randomUUID();
        newOrder.setId(uuid.toString());
        return orderServicesImpl.insertOrder(newOrder);

    }

}

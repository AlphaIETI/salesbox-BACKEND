package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.exceptions.OrderException;
import edu.eci.ieti.salesbox.models.Order;
import edu.eci.ieti.salesbox.persistence.OrderRepository;
import edu.eci.ieti.salesbox.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServicesImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getOrderById(String id) throws OrderException {

        return orderRepository.findById(id).orElseThrow(()->new OrderException("The Order with the ID:" + id + " does not exist."));

    }

    @Override
    public List<Order> getAllOrders() {

        return orderRepository.findAll();

    }

    @Override
    public Order insertOrder(Order newOrder) {

        return orderRepository.save(newOrder);

    }

    @Override
    public void deleteOrderById(String id) {

        Optional<Order> OO = orderRepository.findById(id);
        orderRepository.delete(OO.get());

    }
}

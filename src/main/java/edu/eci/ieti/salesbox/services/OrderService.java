package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.exceptions.OrderException;
import edu.eci.ieti.salesbox.models.Order;

import java.util.List;

public interface OrderService {

    public Order getOrderById(String id) throws OrderException;

    public List<Order> getAllOrders() ;

    public Order insertOrder(Order newOrder);

    public void deleteOrderById(String id) ;
}

package com.unitbv.tst.service;

import com.unitbv.tst.entity.Order;
import com.unitbv.tst.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrder(Integer id){
        return orderRepository.findById(id).get();
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public void deleteOrder(Integer id){
    	orderRepository.deleteById(id);
    }
    
    public List<Order> findByCustomerIdOrderByDate (Integer customerId){
    	return orderRepository.findByCustomerIdOrderByDate(customerId);
    }

}

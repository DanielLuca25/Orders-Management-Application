package com.unitbv.tst.controller;

import com.unitbv.tst.entity.Order;
import com.unitbv.tst.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable("id") Integer id){
        return orderService.getOrder(id);
    }

    @PostMapping
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Integer id){
    	orderService.deleteOrder(id);
    }
    
    @GetMapping("/findByCustomer")
    public List<Order> findByCustomerIdOrderByDate(@RequestParam Integer customerId){
    	return orderService.findByCustomerIdOrderByDate(customerId);
    }
}

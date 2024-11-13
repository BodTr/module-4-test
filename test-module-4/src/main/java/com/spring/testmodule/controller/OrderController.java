package com.spring.testmodule.controller;


import com.spring.testmodule.exception.exceptions.NoOrderFoundException;
import com.spring.testmodule.model.dto.SavingOrderDTO;
import com.spring.testmodule.model.entity.OrderEntity;
import com.spring.testmodule.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<OrderEntity> getOrders() {
        return orderService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder(@RequestBody SavingOrderDTO order) {
        orderService.saveOrder(order);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateOrder(@PathVariable Long id, @RequestBody SavingOrderDTO order) {
        orderService.updateOrder(id, order);
    }

}

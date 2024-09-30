package com.sb.orderservice.awscide.controller;

import com.sb.orderservice.awscide.entity.Order;
import com.sb.orderservice.awscide.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
     OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order order){

             orderService.saveOrder(order);

             return new ResponseEntity<>(order,HttpStatus.CREATED);
    }


    @GetMapping("/findAll")
    public ResponseEntity<List<Order>> findAll(){

        List<Order> orderList=orderService.findAll();

        return new ResponseEntity<>(orderList,HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Order> findById(@PathVariable("id") int id){

        Order order=orderService.findById(id);

        return new ResponseEntity<>(order,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> remove(@PathVariable("id") int id){

        String result=orderService.delete(id);

        return new ResponseEntity<>(result,HttpStatus.OK);
    }

    @GetMapping("/health")
    public String healthCheck(){

        return "UP";
    }
   // @GetMapping("/welcome")
    public String greetings(){

        return "Welcome, AWS CICD pipeline with springboot App.";
    }

}

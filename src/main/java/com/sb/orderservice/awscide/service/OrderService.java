package com.sb.orderservice.awscide.service;

import com.sb.orderservice.awscide.entity.Order;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {


    private final Map<Integer,Order> db=new LinkedHashMap<>();


    public Order saveOrder(Order order){
        db.put(order.getOrderid(),order);
        return order;
    }

    public List<Order> findAll(){
        return db.values().stream().toList();
    }

    public Order findById(int id){
        return db.get(id);
    }

    public String delete(int id){
        db.remove(id);
        return "Done";
    }
}

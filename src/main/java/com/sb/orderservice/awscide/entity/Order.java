package com.sb.orderservice.awscide.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Integer orderid;
    private String itemName;
    private double total;


}

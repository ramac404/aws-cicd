package com.sb.orderservice.awscide.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResonse {

    private int orderid;
    private String itemName;
    private double total;


}

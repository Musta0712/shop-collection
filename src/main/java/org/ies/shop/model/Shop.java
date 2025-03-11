package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.TreeSet;

@Data
@AllArgsConstructor

public class Shop {
    private String name;
    private Map<Integer, Product> productById;
    private TreeSet<Customer> customers;
}

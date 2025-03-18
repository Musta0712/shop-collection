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

    public Customer findCustomer(String nif) {
        for (var customer: customers) {
            if(customer.getNif().equals(nif)) {
                return customer;
            }
        }
        return null;
    }

    public Order findOrder(String nif, int orderId) {
        var customer = findCustomer(nif);
        if(customer != null) {
            return customer.findOrder(orderId);
        } else {
            return null;
        }
    }
}

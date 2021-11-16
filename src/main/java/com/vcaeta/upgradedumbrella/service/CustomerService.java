package com.vcaeta.upgradedumbrella.service;

import com.vcaeta.upgradedumbrella.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    public Customer getCustomer(String id) {
        return new Customer(id, "firstName","lastName", "email");
    }

    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("1a", "firstName","lastName", "email"));
        customers.add(new Customer("2b", "firstName","lastName", "email"));

        return customers;
    }

    public void updateCustomer(Customer customer) {
        System.out.println("Customer updated");
    }

    public void deleteCustomer(String id){
        System.out.println("Customer deleted");
    }
}

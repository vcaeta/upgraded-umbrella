package com.vcaeta.upgradedumbrella.controller;

import com.vcaeta.upgradedumbrella.dto.Customer;
import com.vcaeta.upgradedumbrella.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("getCustomers")
    public ResponseEntity<List<Customer>> getCustomers(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("getCustomer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String id){
        return new ResponseEntity<>(service.getCustomer(id), HttpStatus.OK);
    }

    @PostMapping("updateCustomer")
    public ResponseEntity<String> updateCustomer(Customer customer){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("deleteCustomer/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

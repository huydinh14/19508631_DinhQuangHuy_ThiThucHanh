package com.example.customerservice.service;

import com.example.customerservice.model.Customer;
import com.example.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Transactional(readOnly = true)
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }
}

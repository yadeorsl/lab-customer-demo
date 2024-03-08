package com.lab.labcustomer.service;

import com.lab.labcustomer.model.Customer;
import com.lab.labcustomer.respository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
 private final CustomerRepository customerRepository;
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}

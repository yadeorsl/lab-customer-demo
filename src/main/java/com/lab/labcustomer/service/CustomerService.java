package com.lab.labcustomer.service;

import com.lab.labcustomer.model.Customer;
import com.lab.labcustomer.respository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {
 private final CustomerRepository customerRepository;
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> allCustomer() {
        return customerRepository.findAll();
    }

    public Customer getCustomerFingById(long id) {
        Optional<Customer> customer=customerRepository.findById(id);
       if (customer.isPresent()){
           return customer.get();
       }else {
           log.info("Aradiginiz id de kullanici yok");
           return null;
       }
    }
}

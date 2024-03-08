package com.lab.labcustomer.controller;

import com.lab.labcustomer.model.Customer;
import com.lab.labcustomer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
private final CustomerService customerService;

@PostMapping()
    public Customer addCustomer(@RequestBody Customer customer){

    return customerService.saveCustomer(customer);
}
  @GetMapping
    public List<Customer> allCustomer(){
   return  customerService.allCustomer();
  }
  @GetMapping("{id}")
    public Customer getCustomerByID(@PathVariable("id") long id){
     return customerService.getCustomerFingById(id);
  }

}

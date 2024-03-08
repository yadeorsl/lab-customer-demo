package com.lab.labcustomer.respository;

import com.lab.labcustomer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {




}

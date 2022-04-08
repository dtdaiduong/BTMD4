package com.cg.repository;

import com.cg.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public  List<Customers> findAll(){
        return customerRepository.findAll();
    }

    @Override
    public Customers findById(Long id){
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customers customers){
        customerRepository.save(customers);
    }
    @Override
    public void remove(Long id){
        customerRepository.remove(id);
    }
}

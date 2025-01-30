package com.test.redisTest.service;

import com.test.redisTest.entity.CustomerEntity;
import com.test.redisTest.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CustomerManager implements CustomerService {

    private final CustomerRepository customerRepository;

    @Transactional
    @Override
    public CustomerEntity saveCustomer(String name, String surname) {

        return customerRepository.save(CustomerEntity.builder()
                .name(name)
                .surname(surname)
                .build()
);
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    @Override
    public CustomerEntity getCustomerById(String customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new NoSuchElementException("Customer not found"));
    }
}
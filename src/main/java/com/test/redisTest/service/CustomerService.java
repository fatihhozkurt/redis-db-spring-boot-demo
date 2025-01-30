package com.test.redisTest.service;

import com.test.redisTest.entity.CustomerEntity;

public interface CustomerService {

    CustomerEntity saveCustomer(String name, String surname);

    CustomerEntity getCustomerById(String customerId);
}

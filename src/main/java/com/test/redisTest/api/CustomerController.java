package com.test.redisTest.api;

import com.test.redisTest.dto.CustomerRequest;
import com.test.redisTest.dto.CustomerResponse;
import com.test.redisTest.entity.CustomerEntity;
import com.test.redisTest.mapper.CustomerMapper;
import com.test.redisTest.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController implements CustomerControllerApi {

    private final CustomerService customerService;

    @Override
    public ResponseEntity<CustomerResponse> saveCustomer(CustomerRequest customerRequest) {

        CustomerEntity savedCustomer = customerService.saveCustomer(customerRequest.name(), customerRequest.surname());
        CustomerResponse customerResponse = CustomerMapper.INSTANCE.toCustomerResponse(savedCustomer);

        return new ResponseEntity<>(customerResponse, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CustomerResponse> getCustomerById(String customerId) {

        CustomerEntity customerEntity = customerService.getCustomerById(customerId);
        CustomerResponse customerResponse = CustomerMapper.INSTANCE.toCustomerResponse(customerEntity);

        return new ResponseEntity<>(customerResponse, HttpStatus.FOUND);
    }
}
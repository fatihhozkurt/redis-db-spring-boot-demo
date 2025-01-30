package com.test.redisTest.api;

import com.test.redisTest.dto.CustomerRequest;
import com.test.redisTest.dto.CustomerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.test.redisTest.consts.UrlConstants.*;

@RequestMapping(CUSTOMER)
public interface CustomerControllerApi {

    @PostMapping(SAVE)
    ResponseEntity<CustomerResponse> saveCustomer(@RequestBody CustomerRequest customerRequest);

    @GetMapping(ID)
    ResponseEntity<CustomerResponse> getCustomerById(@RequestParam("customerId")  String customerId);
}
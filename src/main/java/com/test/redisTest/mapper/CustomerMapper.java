package com.test.redisTest.mapper;

import com.test.redisTest.dto.CustomerResponse;
import com.test.redisTest.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);


    CustomerResponse toCustomerResponse(CustomerEntity customerEntity);
}

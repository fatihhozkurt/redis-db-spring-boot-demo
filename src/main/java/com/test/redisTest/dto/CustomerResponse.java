package com.test.redisTest.dto;

import java.util.UUID;

public record CustomerResponse(

        UUID id,
        String name,
        String surname
) {
}

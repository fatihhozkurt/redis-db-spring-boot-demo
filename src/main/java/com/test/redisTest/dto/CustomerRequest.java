package com.test.redisTest.dto;

import org.jetbrains.annotations.NotNull;

public record CustomerRequest(

        @NotNull
        String name,

        @NotNull
        String surname
) {
}
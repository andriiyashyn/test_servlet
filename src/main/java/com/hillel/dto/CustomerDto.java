package com.hillel.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
}

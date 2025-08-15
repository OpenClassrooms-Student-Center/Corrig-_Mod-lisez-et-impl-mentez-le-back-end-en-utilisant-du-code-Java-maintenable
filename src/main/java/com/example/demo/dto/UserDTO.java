package com.example.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {

    private long id;
    private String name;
    private String email;

    private Date created_at;
    private Date updated_at;

}
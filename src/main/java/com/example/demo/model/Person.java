package com.example.demo.model;

import com.example.demo.data.Address;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
// TODO: Include @Document annotation
public class Person {
    // TODO: Include @Id annotation
    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private List<String> aliases;
}

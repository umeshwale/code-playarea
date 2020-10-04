package com.example.springboothateos.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@Data
@Setter
@Getter
public class Person extends RepresentationModel<Person> {
    int age;
    String firstName;
    String lastName;

   /* @JsonCreator
    public Person(@JsonProperty("age") int age,
                  @JsonProperty("firstName") String firstName,
                  @JsonProperty("lastName") String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }*/


    public Person(int age,
                  String firstName,
                  String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

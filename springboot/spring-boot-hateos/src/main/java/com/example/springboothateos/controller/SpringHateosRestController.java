package com.example.springboothateos.controller;

import com.example.springboothateos.model.Person;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class SpringHateosRestController {

    @GetMapping(value = "/hateos")
    public CollectionModel<Person> getPerson () {
        List<Person> personResponse = Arrays.asList(new Person(10, "Johnny", "Walker"));
        Link selfLink = linkTo(SpringHateosRestController.class)
                .withSelfRel();
        return new CollectionModel<Person>(personResponse, selfLink);
    }

    @GetMapping(value = "/persons",  produces = { "application/hal+json" })
    public CollectionModel<Person> getAllPersons() {
        final List<Person> allPersons = Arrays.asList(new Person(10, "Johnny", "Walker"));

        Link link = linkTo(SpringHateosRestController.class).withSelfRel();
        CollectionModel<Person> result = new CollectionModel<>(allPersons, link);
        return result;
    }


}

package ar.com.jalmeyda.controller;

import ar.com.jalmeyda.dto.Person;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by juanalmeyda on 3/13/17.
 */
@RestController
@RequestMapping("/api/person/")
public class PersonController {

    @GetMapping
    public Person findById(String id) {
        return new Person(id, "mock name", new Date());
    }

    @PostMapping
    public Person addPerson(@RequestBody Person person) {
        return person;
    }
}

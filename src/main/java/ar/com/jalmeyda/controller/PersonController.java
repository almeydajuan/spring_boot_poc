package ar.com.jalmeyda.controller;

import ar.com.jalmeyda.dto.Hello;
import ar.com.jalmeyda.dto.Person;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import javax.validation.Valid;

/**
 * Created by juanalmeyda on 3/13/17.
 */
@RestController
@RequestMapping("/api/person/")
public class PersonController {

    @RequestMapping(method = RequestMethod.GET, value = "findPerson/")
    @ApiOperation(
            value = "Find person by id",
            notes = "Find person by id",
            response = Person.class
    )
    @ApiResponses( {
            @ApiResponse( code = 404, message = "Person with such id doesn't exists" )
    } )
    public Person findById(@Valid String id) {
        return new Person(id, "mock name", new Date());
    }

    @RequestMapping(method = RequestMethod.POST, value = "addPerson/")
    @ApiOperation(
            value = "Add a person",
            notes = "Add a person",
            response = Person.class
    )
    @ApiResponses( {
            @ApiResponse( code = 201, message = "The person was created correctly" )
    } )
    public Person addPerson(@Valid @RequestBody Person person) {
        return person;
    }
}

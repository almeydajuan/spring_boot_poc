package ar.com.jalmeyda.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDate;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by juanalmeyda on 3/13/17.
 */
public class Person {

    @NotNull
    private String name;

    @DateTimeFormat
    private Date bornDate;

    @NumberFormat
    private String id;

    public Person() {}

    public Person(String id, String name, Date bornDate) {
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
    }

    public String getName() {
        return name;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public void setId(String id) {
        this.id = id;
    }
}

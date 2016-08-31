package ar.com.jalmeyda.controller;

import ar.com.jalmeyda.dto.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ar.com.jalmeyda.service.HelloService;

/**
 * Created by Juan Almeyda on 5/9/2016.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public Hello hello() {
        return helloService.sayHello();
    }

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }
}

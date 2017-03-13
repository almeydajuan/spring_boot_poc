package ar.com.jalmeyda.controller;

import ar.com.jalmeyda.dto.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ar.com.jalmeyda.service.HelloService;

/**
 * Created by Juan Almeyda on 5/9/2016.
 */
@RestController
@RequestMapping("/api/hello/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(method = RequestMethod.GET, value = "get/")
    public Hello getHello() {
        return helloService.sayHello();
    }

    @RequestMapping(method = RequestMethod.POST, value = "post/")
    public Hello postHello(Hello hello) {
        return hello;
    }

}

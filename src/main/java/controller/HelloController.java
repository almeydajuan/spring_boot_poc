package controller;

import dto.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

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
}

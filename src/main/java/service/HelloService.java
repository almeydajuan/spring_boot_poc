package service;

import dto.Hello;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by JuanA on 5/9/2016.
 */
@Service
public class HelloService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Hello sayHello() {
        return new Hello(String.format(template, counter.incrementAndGet()));
    }
}

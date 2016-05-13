package service;

import dto.Hello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Juan Almeyda on 5/9/2016.
 */
@Service
public class HelloService {

    @Value("${greeting}")
    private String greeting;

    private final AtomicLong counter = new AtomicLong();

    public Hello sayHello() {
        return new Hello(String.format(greeting, counter.incrementAndGet()));
    }
}

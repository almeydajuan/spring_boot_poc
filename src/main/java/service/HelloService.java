package service;

import dto.Hello;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Juan Almeyda on 5/9/2016.
 */
@Service
public class HelloService {

    @Resource
    private Properties properties;

    private final AtomicLong counter = new AtomicLong();

    public Hello sayHello() {
        return new Hello(String.format(properties.getProperty("greeting"), counter.incrementAndGet()));
    }
}

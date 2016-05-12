import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by Juan Almeyda on 5/9/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"controller", "service", "spring"})
public class ApplicationStarter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}
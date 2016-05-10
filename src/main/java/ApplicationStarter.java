import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by JuanA on 5/9/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"controller", "service"})
public class ApplicationStarter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}

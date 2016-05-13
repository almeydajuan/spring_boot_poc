package job;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * Created by Juan Almeyda on 5/12/2016.
 */
@Component
public class HelloJob {

    @Value("${job}")
    private String job;

    @Scheduled(fixedRate = 60000)
    public void run() {
        System.out.println(job);
    }
}

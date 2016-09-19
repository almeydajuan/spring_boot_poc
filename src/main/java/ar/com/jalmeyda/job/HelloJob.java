package ar.com.jalmeyda.job;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Juan Almeyda on 5/12/2016.
 */
@Component
public class HelloJob {

    @Value("${ar.com.jalmeyda.job}")
    private String job;

    @Scheduled(fixedDelayString = "${job.frequency}")
    public void run() {
        System.out.println(job);
    }
}

package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Juan Almeyda on 5/12/2016.
 */
@Configuration
public class SpringConfiguration {

    @Bean(name = "properties")
    public Properties properties() throws IOException {
        Properties properties = new Properties();
        InputStream input = SpringConfiguration.class.getClassLoader()
                .getResourceAsStream(getPropertiesFileName());
        properties.load(input);
        return properties;
    }

    private String getPropertiesFileName() {
        return String.format("%s.properties", System.getProperty("environment"));
    }
}

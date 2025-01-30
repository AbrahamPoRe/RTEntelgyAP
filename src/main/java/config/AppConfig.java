package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.ServiceAnimal;

@Configuration
public class AppConfig {
    @Bean
    public ServiceAnimal serviceAnimal()
    {
        return new ServiceAnimal();
    }
}

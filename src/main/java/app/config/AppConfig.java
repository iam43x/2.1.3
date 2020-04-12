package app.config;

import app.model.Animal;
import app.model.Cat;
import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")

public class AppConfig {

    @Bean("Dog")
    public Animal getAnimalDog(){
        return new Dog();
    }

}

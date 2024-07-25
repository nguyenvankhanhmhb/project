package vn.titv.demo.demo63.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public CommandLineRunner getRunner(){
        return runner -> {
            System.out.println("HELLO WORLD !");
        };
    }
}

package vn.titv.spring.demo55;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyUtil {

    @Bean
    public Calculator getCalculator(){
        return new Calculator();
    }
}

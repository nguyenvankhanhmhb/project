package vn.titv.spring.demo.service;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {

    public SmsService(){
        System.out.println("Constructor của lớp: " + getClass().getSimpleName());
    }
    @Override
    public String sendMessage() {
        return "SMS Seding .....";
    }
}

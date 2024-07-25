package vn.titv.spring.demo.service;

import org.springframework.stereotype.Component;

@Component
public class ZaloService implements MessageService{

    public ZaloService(){
        System.out.println("Constructor của lớp: " + getClass().getSimpleName());
    }
    @Override
    public String sendMessage() {
        return "Zalo Seding .....";
    }
}

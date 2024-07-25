package vn.titv.spring.demo.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class EmailService implements MessageService {


    @PostConstruct
            public void init(){
        System.out.println("đoạn code được run ngay sau khi tao: "+getClass().getSimpleName());
    }
    @PreDestroy
    public void myDestroy(){
        System.out.println("đoạn code được run ngay sau khi huỷ bỏ: "+getClass().getSimpleName());

    }
    public EmailService(){
        System.out.println("Constructor của lớp: " + getClass().getSimpleName());
    }
    @Override
    public String sendMessage() {

        return "Email sending ..... ";
    }

}

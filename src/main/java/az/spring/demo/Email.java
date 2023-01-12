package az.spring.demo;

import org.springframework.stereotype.Component;

@Component("email")
public class Email implements Message {
    @Override
    public void send() {
        System.out.println("Email was send successfully");
    }
}

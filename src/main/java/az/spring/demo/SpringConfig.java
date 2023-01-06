package az.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean("sms")
    public Message getSms(){
        return new Sms();
    }

    @Bean("email")
    public Message getEmail() {
        return new Email();
    }

    @Bean
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setName("Javidan");
        employee.setSurname("Abdullayev");
        employee.setAge(26);
        employee.setSalary(1600);

        return employee;
    }

    @Bean(initMethod = "myInit", destroyMethod = "myDestroy", name = "sms-notification")
    @Scope("singleton")
    public Notification getNotification(@Qualifier("sms")Message message, Employee employee){
        Notification notification = new Notification(); {
            notification.setMessage(message);
            notification.setEmployee(employee);

            return notification;
        }
    }

    @Bean("email-notification")
    public Notification getNotification2(@Qualifier("email") Message message, Employee employee){
        Notification notification = new Notification(); {
            notification.setMessage(message);
            notification.setEmployee(employee);

            return notification;
        }
    }
}

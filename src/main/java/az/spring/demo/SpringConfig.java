package az.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class SpringConfig {

    @Bean(initMethod = "myInit", destroyMethod = "myDestroy", name = "notification")
    public Notification getNotification(){
        return new Notification();
    }

    @Bean("sms")
    public Sms getSms(){
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

    @Bean("deviceAndroid")
    public Device getDeviceAndroid () {
        Device device = new Device();
        device.setName("Android");
        device.setVersion("1.0.3");
        return device;
    }

    @Bean("deviceIOS")
    public Device getDeviceIOS () {
        Device device = new Device();
        device.setName("IOS");
        device.setVersion("1.1.2");
        return device;
    }

}

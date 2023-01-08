package az.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Notification {

    @Autowired
    @Qualifier("email")
    private Message message;

    @Autowired
    private Employee employee;

    public Notification() {
        System.out.println();
    }

    public void myInit () {
        System.out.println("myInit method worked");
    }

    public void myDestroy() {
        System.out.println("destroy method worked");
    }

    public Notification(Message message, Employee employee) {
        this.message = message;
        this.employee = employee;
    }

    public void alert() {
        System.out.println("Notifications...");
        System.out.println(employee);
        message.send();
    }

    public Employee getEmployee() {
        return employee;
    }

    public Notification setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public Message getMessage() {
        return message;
    }

    public Notification setMessage(Message message) {
        this.message = message;
        return this;
    }
}

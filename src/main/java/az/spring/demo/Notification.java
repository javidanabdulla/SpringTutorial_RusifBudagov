package az.spring.demo;

public class Notification {
    private Message message;
    private Employee employee;

    public Notification() {

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
package az.spring.demo;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
@Component
public class Employee {
    private String name, surname;
    private int age;
    private double salary;
    private List<Device> devicesList;
    private Map<String, Device> deviceMap;
    private Properties databaseProperties;

    public Employee() {
    }

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Employee setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public List<Device> getDevicesList() {
        return devicesList;
    }

    public Employee setDevicesList(List<Device> devicesList) {
        this.devicesList = devicesList;
        return this;
    }

    public Map<String, Device> getDeviceMap() {
        return deviceMap;
    }

    public Employee setDeviceMap(Map<String, Device> deviceMap) {
        this.deviceMap = deviceMap;
        return this;
    }

    public Properties getDatabaseProperties() {
        return databaseProperties;
    }

    public Employee setDatabaseProperties(Properties databaseProperties) {
        this.databaseProperties = databaseProperties;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", devices=" + devicesList +
                ", deviceMap=" + deviceMap +
                ", databaseProperties=" + databaseProperties +
                '}';
    }
}

package az.spring.demo;

public class Device {
    private String name, version;

    public String getName() {
        return name;
    }

    public Device setName(String name) {
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Device setVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

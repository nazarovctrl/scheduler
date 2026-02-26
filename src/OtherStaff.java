public class OtherStaff {
    private String name;
    private byte age;
    private String position;
    private String email;
    private double salary; // in dollar

    public static final String[] POSITIONS = {
            "administration",
            "security",
            "canteen",
            "medical"
    };

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

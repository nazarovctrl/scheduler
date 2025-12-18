public class Teacher {

    public static final String[] STATUSES = {
            "professor",
            "associate professor",
            "assistant professor",
            "lecturer",
            "researcher",
            "doctor",
            "phd student",
            "dean",
            "rector",
            "teacher",
            "assistant"
    };

    private String name;
    private byte age;
    private String status;
    private String email;
    private double salary; // in dollar
    private short officeNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(short officeNumber) {
        this.officeNumber = officeNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Nobody works for minus");
        } else if (salary == 0) {
            System.out.println("Slave");
        } else {
            if (salary < 500) {
                System.out.println("That’s below minimum wage!");
                this.salary = salary;
            } else if (salary >= 500 && salary < 3000) {
                System.out.println("Average salary");
                this.salary = salary;
            } else if (salary >= 3000 && salary < 10000) {
                System.out.println("High salary");
                this.salary = salary;
            } else {
                if (salary >= 10000 && salary < 100000) {
                    System.out.println("Are you a rector or what?");
                    this.salary = salary;
                } else {
                    System.out.println("Unrealistic salary value");
                }
            }
        }
    }


    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age <= 0) {
            System.out.println("Impossible");
        } else {
            this.age = age;
        }
    }
}
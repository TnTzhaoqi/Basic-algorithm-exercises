package tokey.stream.util;

public class User {
    public String name ;
    public int salary ;
    public int age ;
    public String status;

    public User(String name, int salary, int age, String status) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }
}

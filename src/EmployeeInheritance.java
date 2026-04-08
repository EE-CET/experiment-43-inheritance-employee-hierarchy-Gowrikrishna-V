import java.util.Scanner;

// Base class
class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println(salary);
    }
}

// Derived class Officer
class Officer extends Employee {
    String specialization;
}

// Derived class Manager
class Manager extends Employee {
    String department;
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Officer object
        Officer o = new Officer();
        o.name = sc.nextLine();
        o.age = sc.nextInt();
        sc.nextLine();
        o.phoneNumber = sc.nextLine();
        o.address = sc.nextLine();
        o.salary = sc.nextDouble();
        sc.nextLine();
        o.specialization = sc.nextLine();

        // Manager object
        Manager m = new Manager();
        m.name = sc.nextLine();
        m.age = sc.nextInt();
        sc.nextLine();
        m.phoneNumber = sc.nextLine();
        m.address = sc.nextLine();
        m.salary = sc.nextDouble();
        sc.nextLine();
        m.department = sc.nextLine();

        // Output
        System.out.println("Officer:");
        System.out.println(o.name);
        System.out.println(o.age);
        System.out.println(o.phoneNumber);
        System.out.println(o.address);
        o.printSalary();
        System.out.println(o.specialization);

        System.out.println("Manager:");
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.phoneNumber);
        System.out.println(m.address);
        m.printSalary();
        System.out.println(m.department);
    }
}

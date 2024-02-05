package oops_concept;

import java.util.Objects;
/*
    Implementation of how to Override the equals(), hashCode() and toString() method
*/
class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return age == employee.age && salary == employee.salary && this.name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", salary= " + salary +
                '}';
    }
}


public class ComparingObjects {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Prashant", 24, 80000);
        Employee emp2 = new Employee("Diksha", 22, 90000);
        Employee emp3 = new Employee("Prashant", 24, 80000);

        // Comparing the reference of two objects
        System.out.println(emp1 == emp3);

        // Comparing the actual contents
        System.out.println(emp1.equals(emp3));

        System.out.println(emp1.toString());

        System.out.println(emp1.hashCode() == emp3.hashCode());
    }
}

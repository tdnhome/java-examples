package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream.flatMap(): One-to-Many + Flattening
 * flatMap() is used when each element of the initial stream can produce multiple elements
 * (like a list or another stream). It "flattens" these nested structures into a single, top-level stream.
 * <a href="https://medium.com/@AlexanderObregon/javas-flatmap-method-explained-3ab4cfc90e64">flatMap Explained</a>
 *
 */
public class Flatmap2 {

    public static void main(String[] args) {
        // A list of departments, each having a list of employees.
        List<Department> departments = Arrays.asList(
                new Department(Arrays.asList(new Employee("Lucas"), new Employee("Mia"))),
                new Department(Arrays.asList(new Employee("Noah"), new Employee("Sophia"))),
                new Department(Arrays.asList(new Employee("Ethan"), new Employee("Lily")))
        );

        // Flattening the list of employees from all departments
        List<Employee> allEmployees = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.toList());

        allEmployees.forEach(System.out::println);
    }

    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class Department {
        List<Employee> employees;

        Department(List<Employee> employees) {
            this.employees = employees;
        }

        public List<Employee> getEmployees() {
            return employees;
        }
    }

}
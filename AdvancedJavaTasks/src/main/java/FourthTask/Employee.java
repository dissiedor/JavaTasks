package FourthTask;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int age;
    private double salary;
    private int yearsOfService;

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 30, 120000, 3);
        Employee employee2 = new Employee("Jane", 28, 80000, 2);
        Employee employee3 = new Employee("Bob", 35, 150000, 5);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

        Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);
        Comparator<Employee> ageComparator = Comparator.comparingInt(Employee::getAge);
        Comparator<Employee> yearsOfServiceComparator = Comparator.comparingInt(Employee::getYearsOfService);

        System.out.println("Информация о сотрудниках:");
        employees.forEach(employee -> System.out.println(employee));

        System.out.println("\nСотрудники с зарплатой выше 100 000:");
        employees.stream()
                .filter(employee -> employee.getSalary() > 100000)
                .forEach(employee -> System.out.println(employee));

        System.out.println("\nСотрудник с максимальной зарплатой:");
        Optional<Employee> employeeWithMaxSalary = employees.stream()
                .max(salaryComparator);
        employeeWithMaxSalary.ifPresent(employee -> System.out.println(employee));

        System.out.println("\nГруппировка по имени сотрудников:");
        Map<String, List<Employee>> employeesByName = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName));
        employeesByName.forEach((name, employeeList) -> {
            System.out.println("Имя: " + name);
            employeeList.forEach(emp -> System.out.println("\t" + emp));
        });

        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("\nСумма зарплат всех сотрудников: " + totalSalary);

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("\n Средняя зарплата сотрудников: " + averageSalary);
    }
}
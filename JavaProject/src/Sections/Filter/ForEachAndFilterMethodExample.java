package Sections.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachAndFilterMethodExample {

    public static void main(String args[]) {

        EmployeeService.getFilteredEmployees();
        System.out.println("SORTED EMPLOYEES MORE THEN 20K SALARY");
        EmployeeService.getFilteredEmployeeMoreThan20KSalary().stream().forEach(e -> System.out.println(e));
        System.out.println("SORTED EMPLOYEES LESS THEN 20K SALARY");
        EmployeeService.getFilteredEmployeeLessThan20KSalary().stream().forEach(e -> System.out.println(e));
        System.out.println("SORTED EMPLOYEES LESS THEN 20K SALARY WITH PARAMS");
        EmployeeService.getFilteredEmployeeMoreThan20KSalaryWithParam("min").stream().forEach(e -> System.out.println(e));

    }

}

class EmployeeUtil {

    public static List<Employee> setEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Yomal",10000.00));
        list.add(new Employee(2, "Ushan",15000.00));
        list.add(new Employee(3, "Damith",20000.00));
        list.add(new Employee(4, "Dasith",25000.00));
        list.add(new Employee(5, "Kavi",30000.00));
        return list;
    }
}

class EmployeeService {

    public static void getFilteredEmployees() {
        EmployeeUtil.setEmployees().stream().forEach(t -> System.out.println(t));
    }

    public static List<Employee> getFilteredEmployeeMoreThan20KSalary() {
        return EmployeeUtil.setEmployees().stream().filter(t -> t.getSalary() >= 20000).collect(Collectors.toList());
    }

    public static List<Employee> getFilteredEmployeeLessThan20KSalary() {
        return EmployeeUtil.setEmployees().stream().filter(t -> t.getSalary() <= 20000).collect(Collectors.toList());
    }

    public static List<Employee> getFilteredEmployeeMoreThan20KSalaryWithParam(String salary) {
        return (salary.equalsIgnoreCase("max")) ?
                EmployeeUtil.setEmployees().stream().filter(t -> t.getSalary() >= 20000).collect(Collectors.toList())
                : EmployeeUtil.setEmployees().stream().filter(t2 -> t2.getSalary() <= 20000).collect(Collectors.toList());
    }
}

class Employee {

    private Integer empID;
    private String name;
    private double salary;

    public Employee(Integer empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
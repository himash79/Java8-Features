package Sections.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {

    public static void main(String args[]) {

        System.out.println("=======================ALL THE LIST DETAILS=======================");
        List<Employee_old> emps = EmployeeData.setEmployeeData();
        System.out.println(emps);
        System.out.println("=======================EMP NAME LIST=======================");
        List<String> empNames = EmployeeData.setEmployeeData().stream().map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(empNames); // Extract data using map() method using single list data
        System.out.println("=======================EMP CONTACTS LIST=======================");
        List<List<String>> empContactsList = EmployeeData.setEmployeeData().stream().map(emp -> emp.getContactNo()).collect(Collectors.toList());
        System.out.println(empContactsList); // This data inside list of list (Stream of Stream of data)
        System.out.println("=======================EMP CONTACTS LIST=======================");
        List<String> empContactList = EmployeeData.setEmployeeData().stream().flatMap(emp -> emp.getContactNo().stream()).collect(Collectors.toList());
        System.out.println(empContactList); // Extract Stream of Stream of data using flatMap() method
    }

}


class EmployeeData {

    public static List<Employee_old> setEmployeeData() {
        List<Employee_old> emp = new ArrayList<>();
        emp.add(new Employee_old(1,"Yomal","IT",13500, Arrays.asList("123","456")));
        emp.add(new Employee_old(2,"Ushan","Finance",19000,Arrays.asList("789","123")));
        emp.add(new Employee_old(3,"Damith","Accounts",25000,Arrays.asList("456","678")));
        emp.add(new Employee_old(4,"Dasith","HR",43900,Arrays.asList("321","546")));
        emp.add(new Employee_old(5,"Gayan","ENG",67400,Arrays.asList("786","980")));
        return emp;
    }
}

class Employee_old {

    private Integer empID;
    private String name;
    private String dep;
    private Integer salary;
    private List<String> contactNo;

    public Employee_old(Integer empID, String name, String dep, Integer salary, List<String> contactNo) {
        this.empID = empID;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
        this.contactNo = contactNo;
    }

    public Employee_old() {
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

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<String> getContactNo() {
        return contactNo;
    }

    public void setContactNo(List<String> contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Employee_old{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", dep='" + dep + '\'' +
                ", salary=" + salary +
                ", contactNo=" + contactNo +
                '}';
    }
}
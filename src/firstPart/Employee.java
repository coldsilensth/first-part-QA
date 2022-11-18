package firstPart;

public class Employee {
    private String name;
    private int salary;
    private String employeePosition;

    public Employee(String name, int salary, String employeePosition) {
        this.name = name;
        this.salary = salary;
        this.employeePosition = employeePosition;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }


    @Override
    public String toString() {
        return "firstPart.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employeePosition='" + employeePosition + '\'' +
                '}';
    }
}
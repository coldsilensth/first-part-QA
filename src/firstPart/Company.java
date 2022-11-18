package firstPart;

import java.util.Arrays;

public class Company {
    private String name;
    private Double holdingBudget;
    private String directorOfCompany;
    private Integer number;
    private final Integer numberEmployees = 3;
    private Employee[] employees = new Employee[numberEmployees];

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Company(String name, Double holdingBudget, String directorOfCompany, Integer number) {
        this.name = name;
        this.holdingBudget = holdingBudget;
        this.directorOfCompany = directorOfCompany;
        this.number = number;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHoldingBudget() {
        return holdingBudget;
    }

    public void setHoldingBudget(Double holdingBudget) {
        this.holdingBudget = holdingBudget;
    }

    public String getDirectorOfCompany() {
        return directorOfCompany;
    }

    public void setDirectorOfCompany(String directorOfCompany) {
        this.directorOfCompany = directorOfCompany;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public boolean dropEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName() == name) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    public void totalEmployees() {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count++;
            } else {
                count2++;
            }

            System.out.println("Число рабочих мест: " + "в " + (i + 1) + " компании " + count);
            System.out.println("Число вакантных мест: " +"в " + (i + 1) + " компании " + count2);

        }
    }
    public void employeesInfo() {
        Employee[] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО " + employees[i].getName());
                System.out.println("Заработная плата " + employees[i].getSalary());
                System.out.println("Должность " + employees[i].getEmployeePosition());
            }
        }
    }

    public void totalSalaryOfEmployees() {
        Employee[] employees = this.employees;
        Double count = 0d;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count = count + employees[i].getSalary();
            }
        }
        System.out.println("Бюджет всех работников компании " + count);
    }
    public void getEmployeeByName(String name) {
    }

    public void infoEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО " + employees[i].getName());
                System.out.println("Заработная плата " + employees[i].getSalary());
                System.out.println("Должность " + employees[i].getEmployeePosition());
            }
        }
    }

    @Override
    public String toString() {
        return "firstPart.Company{" +
                "name='" + name + '\'' +
                ", holdingBudget=" + holdingBudget +
                ", directorOfCompany='" + directorOfCompany + '\'' +
                ", number=" + number +
                ", numberEmployees=" + numberEmployees +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}

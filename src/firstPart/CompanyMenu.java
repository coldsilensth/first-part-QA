package firstPart;

import java.util.Scanner;

public class CompanyMenu {
    public static void start(Company company) {
        Holding holding = new Holding();

        Company company6 = new Company("CocaCola", 13000.0, "Andrey", 6);

        Employee employee7 = new Employee("Emir", 89000, "JavaScript developer");
        Employee employee8 = new Employee("Aliya", 78000, "SMM");

        company6.addEmployee(employee7);
        company6.addEmployee(employee8);


        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информацию о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("6) Поменять руководителя компании");
            System.out.println("7) Меню для работы с сотрудниками");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Вывод информации о компании " + company6.getName());
                System.out.println("Наименование компании " + company6.getName());
                System.out.println("Руководитель компании " + company6.getName() + " это " + company6.getDirectorOfCompany());
                System.out.println("Бюджет компании " + company6.getName() + " " + company6.getHoldingBudget());
            } else if (command == 2) {
                company6.employeesInfo();
            } else if (command == 3) {
                company6.totalSalaryOfEmployees();
            } else if (command == 4) {
                Employee employee9 = new Employee();

                System.out.println("Как зовут нашего нвового соторудника?");
                String name = in.next();
                employee9.setName(name);

                System.out.println("Зарплата нового сотрудника:");
                int salary = in.nextInt();
                employee9.setSalary(salary);

                System.out.println("Должность нового сотрудника");
                String employeePosition = in.next();
                employee9.setEmployeePosition(employeePosition);
                company6.addEmployee(employee9);

                System.out.println("Сотрудник добавлен в список! Проверьте!");
                company6.employeesInfo();
            } else if (command == 5) {
                System.out.println("Сотрудник " + employee8.getName() + " уволен");
                company6.dropEmployee("Aliya");
                company6.employeesInfo();
            } else if (command == 6) {
                System.out.println(employee7.getName() + " поздравляю с повышением!");
                company6.dropEmployee("Emir");
                company6.setDirectorOfCompany(employee7.getName());
                System.out.println("Вывод информации о компании " + company6.getName());
                System.out.println("Наименование компании " + company6.getName());
                System.out.println("Новый руководитель компании " + company6.getName() + " это " + company6.getDirectorOfCompany());
                System.out.println("Бюджет компании " + company6.getName() + " " + company6.getHoldingBudget());
            } else if (command == 7) {
                company6.getEmployeeByName("Aliya");
                Employee foundedEmployee = new Employee();
                EmployeeMenu.start(foundedEmployee);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}

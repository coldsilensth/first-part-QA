package firstPart;

import java.util.Scanner;

public class EmployeeMenu extends CompanyMenu {
    public static void start(Employee employee) {
        Employee employee7 = new Employee("Emir", 89000, "JavaScript developer");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1) Вывод информации о сотруднике");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Имя сотрудника - " + employee7.getName());
                System.out.println("Заработная плата сотрудника - " + employee7.getSalary());
                System.out.println("Позиция сотрудника - " + employee7.getEmployeePosition());
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
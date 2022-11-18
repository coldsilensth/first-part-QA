package firstPart;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Holding holding = new Holding();
        Company company = new Company();

        Company company1 = new Company("Apple", 13000.0, "Andrey",1 );
        Company company2 = new Company("Asus",17000.0, "Andrey",2 );
        Company company3 = new Company("Samsung",15000.0, "Andrey",3 );
        Company company4 = new Company("Puma",14000.0, "Andrey",4 );
        Company company5 = new Company("Nike",13000.0, "Andrey",5 );

        holding.addCompany(company1);
        holding.addCompany(company2);
        holding.addCompany(company3);
        holding.addCompany(company4);
        holding.addCompany(company5);

        Employee employee1 = new Employee("Anna", 100000, "IOS developer");
        Employee employee2 = new Employee("Kit", 50000, "SMM Manager");
        Employee employee3 = new Employee("Alina", 60000, "Project Manager");
        Employee employee4 = new Employee("Kirill", 90000, "Frontend developer");
        Employee employee5 = new Employee("Beka", 89000, "JavaScript developer");
        Employee employee6 = new Employee("Aliya", 78000, "SMM");

        company1.addEmployee(employee1);
        company2.addEmployee(employee2);
        company3.addEmployee(employee3);
        company4.addEmployee(employee4);
        company5.addEmployee(employee5);
        company5.addEmployee(employee6);

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Главне меню для работы с холдингом: ");

            System.out.println("1) Вывод списка компаний в холдинге");
            System.out.println("2) Вывод общего бюджета холдинга");
            System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже работающих сотрудников");
            System.out.println("4) Добавление компании в холдинг");
            System.out.println("5) Удаление компании из холдинга");
            System.out.println("6) Меню для работы с компанией");
            System.out.println("0) Выход из главного меню");

            int command = in.nextInt();

            if (command == 1) {
                    holding.listOfCompanies();
            } else if(command== 2){
             holding.totalBudgetHoldings();
            } else if(command == 3){ //?
                company.totalEmployees();
            } else if(command == 4){
                Company company6 = new Company();
                System.out.println("Название вашей компании");
                String name = in.next();
                company6.setName(name);
                System.out.println("Введите бюджет компании(через запятую, потому что тип Double)");
                Double holdingBudget = in.nextDouble(); //вводить бюджет через запятую
                company6.setHoldingBudget(holdingBudget);
                System.out.println("Введите иям директора вашей компании");
                String directorOfCompany = in.next();
                company6.setDirectorOfCompany(directorOfCompany);

                System.out.println("Номер вашей компании");
                Integer number = in.nextInt();
                company6.setNumber(number);
                holding.addCompany(company6);
                holding.listOfCompanies();
            } else if (command == 5) {
                System.out.println("Удаляем компанию " + company2.getName());
                holding.dropCompany(company2);
                holding.listOfCompanies();
            } else if (command == 6){
                Company foundedCompany = new Company();
                CompanyMenu.start(foundedCompany);
            } else if (command == 0) {
                break;
            }
        }
    }
}
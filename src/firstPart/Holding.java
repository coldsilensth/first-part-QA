package firstPart;

import java.util.Arrays;

public class Holding {
    private final Integer numberOfSeats = 6; //количество мест посадочных в маршрутке
    Company[] companies = new Company[numberOfSeats];

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }
    public void listOfCompanies() {
        Company[] companies = this.companies;
        System.out.println("Список компаний:");
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null) {
                System.out.println(companies[i].getName());
            }
        }
    }

    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                return true;
            }
        }
        return false;
    }

    public boolean dropCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == company) {
                companies[i] = null;
                return true;
            }
        }
        return false;
    }

    public void totalBudgetHoldings() {
        Company[] companies = this.companies;
        Double count = 0d;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null) {
                count = count + companies[i].getHoldingBudget();
            }
        }

        System.out.println("Общий бюджет холдингов " + count + " сом");
    }

    public void getCompanyByName(String name) {
        Company[] companies = this.companies;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].getName().equals(name)) {
                System.out.println("Наименование компании " + companies[i].getName());
                System.out.println("Руководитель компании " + companies[i].getName() + " это " + companies[i].getDirectorOfCompany());
                System.out.println("Сотрудники компании " + companies[i].getName() + Arrays.toString(companies[i].getEmployees()));
                System.out.println("Бюджет компании " + companies[i].getName() + " " + companies[i].getHoldingBudget());
            }
        }
    }
}

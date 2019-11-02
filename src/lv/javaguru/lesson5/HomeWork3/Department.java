package lv.javaguru.lesson5.HomeWork3;

public class Department {
    private String name;
    private Company company;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCompany(Company company) {
        Company first = new Company();
        first.setName("IBM");
        first.setRegistrationNumber("6786913-HM");
        this.company = company;
    }

    public Company getCompany() {

        return company;
    }

    public String toString(){
        return "Department name: " + getName()+ "\n"+
                "Company name: " + getCompany();
    }
}

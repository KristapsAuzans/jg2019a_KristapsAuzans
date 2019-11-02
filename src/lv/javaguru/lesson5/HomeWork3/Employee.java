package lv.javaguru.lesson5.HomeWork3;

public class Employee {
    private String contractNumber;
    private double salary;
    private Department department;

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment() {
        Department department = new Department();
        department.setName("R&D");
        department.getCompany();


    }

    public Department getDepartment() {
        return department;
    }

    public String toString() {
        return "Contract Number: " + getContractNumber() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Department: " + getDepartment();
    }


}

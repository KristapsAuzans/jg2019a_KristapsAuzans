package lv.javaguru.lesson5.HomeWork3;

//pienāc nodarbībā, es paskaidrošu
public class EmployeeTest {
    public static void main(String[] args) {
         Employee first = new Employee();
         first.setContractNumber("786");
         first.setSalary(1300);
         first.setDepartment();
         //Neesmu ticis galā ar uzdevumu, nevaru izdomāt, kā smuki visu integrēt, lai nolasītu datus jau no employee klases.


        System.out.println(first.toString());
    }
    }

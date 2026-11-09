import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import peyrollsystem.employee;

public class PayrollSystem {
    public static void main(String[] args) {
        List<employee> employees = new ArrayList<>();

        
        List<employee> add = employees.add(new FullTimeemployee("F01", "Ali", 3000.0, LocalDate.of(2021, 5, 10), 500.0));
        List<employee> add1 = employees.add(new Contractoremployee("C01", "Sara", LocalDate.of(2022, 1, 15), 50, 40));

        
        Collections.sort(employees);

        // طباعة تفاصيل كل موظف
        for (employee emp : employees) {
            System.out.println(emp);
            System.out.println("taxs: " + emp.calculateTax());
            System.out.println(" salary: " + emp.calculateNetSalary());
            System.out.println("  " + emp.calculateBonus(10.0));
            System.out.println("----------------------------------------");
        }
    }

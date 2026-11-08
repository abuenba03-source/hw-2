/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peyrollsystem;

import java.time.LocalDate;

public class Contractoremployee extends employee {
    private int hourlyRate;
    private int hoursWorked;

    public Contractoremployee(String id, String name, LocalDate joinDate, int hourlyRate, int hoursWorked) {
        // الراتب الأساسي يحسب كحاصل ضرب الساعات في المعدل بالساعة
        super(id, name, hourlyRate * hoursWorked, joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateNetSalary() {
        // صافي الراتب = إجمالي الدخل - الضريبة
        return (hourlyRate * hoursWorked) - calculateTax();
    }

    @Override
    public double calculateBonus(double performanceScore) {
        // مكافأة إضافية حسب ساعات العمل والأداء
        return (hourlyRate * hoursWorked) * (performanceScore / 100.0);
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + " [ContractorEmployee, Rate=" + hourlyRate + ", Hours=" + hoursWorked + "]";
    }

    @Override
    public int compareTo(employee o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculatetax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculatebonus(double performanceScore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int calculateTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
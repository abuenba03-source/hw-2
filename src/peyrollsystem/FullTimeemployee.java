/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peyrollsystem;
import java.time.LocalDate;

public class FullTimeemployee extends employee {
    private double allowance;

    public FullTimeemployee(String id, String name, double baseSalary, LocalDate joinDate, double allowance) {
        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;
    }

    @Override
    public double calculateNetSalary() {
        // صافي الراتب = الراتب الأساسي + العلاوة - الضريبة
        return (baseSalary + allowance) - calculateTax();
    }

    @Override
    public double calculateBonus(double performanceScore) {
        // نسبة المكافأة حسب تقييم الأداء من الراتب الأساسي
        return baseSalary * (performanceScore / 100.0);
    }

    public double getAllowance() {
        return allowance;
    }

    @Override
    public String toString() {
        return super.toString() + " [FullTimeEmployee, Allowance=" + allowance + "]";
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
}
package peyrollsystem;

import java.time.LocalDate;

public abstract class employee implements Comparable<employee >, Taxable, BonusCalculable {
    private String id;
    private String name;
    protected double baseSalary;
    private LocalDate joinDate;

    public employee (String id, String name, double baseSalary, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.joinDate = joinDate;
    }

    public abstract double calculateNetSalary();

    @Override
    public int compareTo(employee other) {
        // المقارنة على أساس الراتب الأساسي (أو id حسب الرغبة)
        return Double.compare(this.baseSalary, other.baseSalary);
    }

    @Override
    public double calculateTax() {
        return this.baseSalary * TAX_RATE;
    }

    @Override
    public abstract double calculateBonus(double performanceScore);

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", joinDate=" + joinDate +
                '}';
    }
}

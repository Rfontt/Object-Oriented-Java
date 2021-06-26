package employee;

public class Programmer extends Employee{
    public double getBonus() {
        return super.getSalary() + 200;
    }
}

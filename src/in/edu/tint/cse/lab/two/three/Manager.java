package in.edu.tint.cse.lab.two.three;

public class Manager extends Employee{
    private int bonus;
    Manager() {}
    Manager(String name, String department, int bonus, int salary) {
        super(name, department, salary);
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }
    public int getSalary(){
        return bonus + super.getSalary();
    }
    public String display() {
        return "Manager{ " +
                "Total Salary=" + getSalary() +
                ", bonus=" + bonus +
                ", Employee=[ " + super.display() + " ]" +
                " }";
    }
}

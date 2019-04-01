package staff;

public abstract class Employee {


    private String name, nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary (double amount) {
        Math.abs(this.salary += amount);
    }

    public double payBonus () {
        return (this.salary * 0.01);
    }

}

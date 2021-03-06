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

    public void changeName(String newName) {
       if(newName != null) {
           this.name = newName;
       }
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary (double amount) {
        this.salary += Math.abs(amount);
    }

    public double payBonus () {
        return (this.salary * 0.01);
    }

}

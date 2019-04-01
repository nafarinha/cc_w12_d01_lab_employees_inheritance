package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nINumber, double salary, String deptName, double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus () {
    // salary property is private.
    // getter fn needs to be used instead to get salary value.
        return (this.getSalary() * 0.02);
    }
}

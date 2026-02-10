public class Teacher extends PersonIN{
    private final int monthlySalary;

    public Teacher(String name, String address, int monthlySalary) {
        super(name, address);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Monthly Salary: " + monthlySalary;
    }
}

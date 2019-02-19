public class Salary {

    private final int monthlySalary;

    private int monthlySalaryCalculator(int salary) {
        return salary / 12;
    }

    public Salary(int salary) {
        this.monthlySalary = monthlySalaryCalculator(salary);
    }

    @Override
    public String toString() {
        return String.valueOf(monthlySalary);
    }
}

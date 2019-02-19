public class Person {

    private final String _fullName;
    private final int monthlySalaryOutput;
    private final int magicYearOutput;

    // method to return full name
    private String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    // method to return salary / 12
    private int monthlySalary(int salary){
        return salary / 12;
    }

    // method to return magic year
    private int magicYear(int year){
        return year + 65;
    }

    public Person(String firstName, String surname, int salary, int year) {
        this._fullName = fullName(firstName, surname);
        this.monthlySalaryOutput = monthlySalary(salary);
        this.magicYearOutput = magicYear(year);
        System.out.println("Name: " + _fullName);
        System.out.println("Monthly Salary: " + monthlySalaryOutput);
        System.out.println("Magic Year: " + magicYearOutput);
    }
}
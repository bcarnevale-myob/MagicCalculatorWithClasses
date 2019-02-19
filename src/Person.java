public class Person {

    private final String firstName;
    private final String lastName;
    private Salary salary;
    private MagicYear magicYear;

    public Person(String firstName, String lastName, int salary, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = new Salary(salary);
        this.magicYear = new MagicYear(year);
    }

    // method to return full name
    public String fullName(){
        return firstName + " " + lastName;
    }

    public Salary getSalary() {
        return salary;
    }

    public MagicYear getMagicYear() {
        return magicYear;
    }
}
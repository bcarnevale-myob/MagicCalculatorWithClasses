import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputStream input = System.in;
        Scanner readInput = new Scanner(input);

        System.out.println("Welcome to the magic calculator");

        System.out.println("Please input your first name:");
        String firstName = readInput.nextLine();

        System.out.println("Please input your surname:");
        String lastName = readInput.nextLine();

        System.out.println("Please enter your annual salary:");
        int salary = Integer.parseInt(readInput.nextLine());

        System.out.println("Please enter your work start year:");
        int year = Integer.parseInt(readInput.nextLine());

        Person name = new Person(firstName, lastName, salary, year);
        Person name2 = new Person("some", "person", 1000, 1933);

        ArrayList<Person> people = new ArrayList<>();
        people.add(name);
        people.add(name2);


        for (Person person : people) {

            System.out.println("Name: " + person.fullName());
            System.out.println("Monthly Salary: " + person.getSalary());
            System.out.println("Magic Year: " + person.getMagicYear());

        }
    }

}
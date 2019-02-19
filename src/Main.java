import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputStream input = System.in;
        Scanner readinput = new Scanner(input);

        System.out.println("Welcome to the magic calculator");

        System.out.println("Please input your name:");
        String linename = readinput.nextLine();

        System.out.println("Please input your surname:");
        String linesurname = readinput.nextLine();

        System.out.println("Please enter your annual salary:");
        int linesalary = Integer.parseInt(readinput.nextLine());

        System.out.println("Please enter your work start year:");
        int lineyear = Integer.parseInt(readinput.nextLine());

        Person name = new Person(linename, linesurname, linesalary, lineyear);
    }

}
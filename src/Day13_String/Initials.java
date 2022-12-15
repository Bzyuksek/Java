package Day13_String;
import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next(); //"Java"

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(2);
        char l = lastName.charAt(1);

        String initial =  f + "." + l;

        System.out.println("initial = " + initial);


        scan.close();

    }

}



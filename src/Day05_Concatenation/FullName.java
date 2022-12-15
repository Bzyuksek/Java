package Day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstNAme = "Ben";
        String lastName = "Taylor";

        String jobTitle = "SDET";
        String companyName = "Apple INC";
        double salary = 100000.58;
        int age = 45;
        String fullName = firstNAme + " " + lastName;

        // Full name of the person is
        System.out.println("Full name of the person is " + fullName);

// ___ is __ years old.

        System.out.println(fullName + " is " + age + " years old.");
// full name is jobTitle, works at CompanyName , and fullname salary is salary

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName +"'s salary is $" + salary);

    }
}

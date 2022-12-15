package Day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int number = 100;

        if ( number%2==0)
        {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("-------------------------------------");

        String result1 = (number%2==0)? "Even" :"Odd";
        System.out.println(result1);
    }
}

package Day16;

public class qzzz {

    public static void main(String[] args) {


        int number= 5;

        while (number<100){
            number += number;

        }


        System.out.println(number);

        System.out.println("---------------------------------");

        int a =0;

        do {
            a= a++ + --a - (a%3);

        }while (++a<4);

        System.out.println(a);

    }
}

package day01_JavaIntro;

import Day24_CustomMethods_Return.ReturnMethodIntro;
import Day24_CustomMethods_Return.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {

String  str = "aaaaaaaaabbbbbbbbbbbbbbbbb";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.printf(str);
        System.out.printf("----------------------------");
      String name = "Java Programming";


     String reverseName=ReturnMethodIntro.reverse(name);

        System.out.println(reverseName);
    }
}

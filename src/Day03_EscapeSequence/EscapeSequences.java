package Day03_EscapeSequence;

/*
Escape Sequences: Must be given with double quote

    \n: starts a new line
    \t: paragraph space (tab)
    \\: single back slash\

 */

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("------------------------------");
        System.out.println("Hello Cydeo, \nHow are you all today? \nIt's nice to see you all. \nWhat class do we have next week?");

        System.out.println("-------------------");

        System.out.println("\tJava is cool Programming Language");

        System.out.println("-------------------");
        System.out.println("/ \\"); //in order to print single backward slash we need to give two backward slash

        System.out.println("-------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\""); //in order to print double quote we need to use \"


    }

}

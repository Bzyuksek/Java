package Day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {


        int firstNumber = 100;
        int secondNumber = 50;

        //100+50=150
        //100-50=50
        //100*50=5000

        int addition = firstNumber + secondNumber;
        int subsraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        System.out.println(firstNumber + "+" + secondNumber +"=" + addition);
        System.out.println(firstNumber + "-" + secondNumber +"=" + subsraction);
        System.out.println(firstNumber + "*" + secondNumber +"=" + multiplication);

    }


}

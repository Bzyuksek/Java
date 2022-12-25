package Day32_Constructor;

public class Test {

    public Test(){ //A
        System.out.println("A");
    }

    public Test(int a){ //A  Book
        this();
        System.out.println("Book");
    }

    public Test(double a){ //A Book C
        this(10);
        System.out.println("C");
    }

    public Test(String str){ // A Book C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {

        new Test("Java");

    }




}

package Day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 20,
                b = 50,
                c = 35 ;


        boolean aIsMedian = (a > b && a < c) || (a > c && a <b);
        boolean bIsMedian = (b>a && b<c)||(b>c&&b<a);
        boolean cIsMedian = (c>a && c<b) ||(c<a && c>b);
                 //boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian) {
            System.out.println(a + " is medium number.");
        }
        if (bIsMedian){
            System.out.println(b + " is medium number.");
        }
        if (cIsMedian){
            System.out.println(c + " is medium number.");
        }

    }

}

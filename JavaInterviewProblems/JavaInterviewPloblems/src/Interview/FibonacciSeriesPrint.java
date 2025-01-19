package Interview;

public class FibonacciSeriesPrint {
    public static void main(String[] args) {
        int n = 10;
        int firstNo = 0;
        int secondNo = 1;
        int nextNumber;
        System.out.println("Fibo series till " + n + " is : ");
        System.out.println(firstNo);
        System.out.println(secondNo);
        for (int i = 0 ; i < n; i ++){
            nextNumber = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = nextNumber;
            System.out.println(nextNumber);
        }
    }
}

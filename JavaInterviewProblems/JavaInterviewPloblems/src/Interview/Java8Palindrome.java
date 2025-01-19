package Interview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Java8Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(isPalindrome(number)){
            System.out.println("This is a palindrome number");
        }else {
            System.out.println("It is not a Palindrome");
        }
    }

    private static boolean isPalindrome(int number) {
        String original = String.valueOf(number);
        String reversed = IntStream.rangeClosed(1,original.length())
                    .mapToObj(element->original.charAt(original.length()-element))
                    .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString();
        return original.equals(reversed);
    }
}

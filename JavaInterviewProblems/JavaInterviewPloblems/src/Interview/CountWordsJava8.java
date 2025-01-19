package Interview;

import java.util.Arrays;

public class CountWordsJava8 {
    public static void main(String[] args) {
        String str = "Jai shree ram";
        long count  = Arrays.stream(str.split("\\s+")).count();
        System.out.println("This String has " + count + " words");
    }
}

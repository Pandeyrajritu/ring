package Interview;

import java.util.stream.IntStream;

public class PrintAlternativeArrayElements {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        IntStream.range(0, arr.length).filter(i->i%2==0).map(i->arr[i]).forEach(System.out::println);
    }
}

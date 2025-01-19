package Interview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintElements {
    public static void main(String[] args) {
        String[] arr = {"ONE" , "TWO", "THREE", "Five"};

        //Method 1
        Arrays.asList(arr).forEach(System.out::println);

        //Method 2
        Arrays.stream(arr).forEach(System.out::println);

        //Method 3
        Stream.of(arr).forEach(System.out::println);

        //Method 4
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }

        //Method 5
        for (String element : arr){
            System.out.println(element);
        }

        //Method 6
        System.out.println(Arrays.toString(arr));

        //Method 7
        String result = Arrays.stream(arr).collect(Collectors.joining(", "));
        System.out.println(result);

    }
}

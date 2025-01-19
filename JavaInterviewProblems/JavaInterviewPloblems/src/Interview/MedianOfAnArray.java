package Interview;

import java.util.Arrays;

public class MedianOfAnArray {

    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 9, 8, 6};
        double Median = findMedian(arr);
        System.out.println("Median : " + Median);
    }

    private static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 != 0) {
            return arr[n/2];
        }else {
            return (arr[(n-1)/2] + arr[n/2])/2.0;
        }
    }
}

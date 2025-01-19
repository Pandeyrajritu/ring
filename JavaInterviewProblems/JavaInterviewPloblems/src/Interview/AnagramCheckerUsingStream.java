package Interview;

public class AnagramCheckerUsingStream {
    public static void main(String[] args) {
        System.out.println(isAnagram("Silent", "Violent"));
    }

    private static boolean isAnagram(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }
        String sortedStr1 = str1.toLowerCase().chars().sorted().collect(StringBuilder :: new , StringBuilder :: append , StringBuilder :: append).toString();
        String sortedStr2 = str2.toLowerCase().chars().sorted().collect(StringBuilder :: new , StringBuilder :: append , StringBuilder :: append).toString();

        return (sortedStr1.equals(sortedStr2));

    }
}

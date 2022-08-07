package basicprac.String;

public class StringCompareDemo {
    public static void main(String[] args) {
        String str1=new String("Sandeep");
        String str2=new String("sandeep");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));//comparing unicode c
        System.out.println(str1.compareToIgnoreCase(str2));
    }

}

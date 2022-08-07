package revision.interviewquestions;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayUtils {


   public static long productMinMax(Integer[] array) {
        Arrays.sort(array, Comparator.reverseOrder());
        int maxNumber = array[0];
        int secondMaxNumber = array[1];
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("secondMaxNumber = " + secondMaxNumber);
        return secondMaxNumber * maxNumber;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{10, 11, 13, 9, 2, 4};
        long product = productMinMax(arr);
        System.out.println("Product of min and max element = " + product);
    }
}


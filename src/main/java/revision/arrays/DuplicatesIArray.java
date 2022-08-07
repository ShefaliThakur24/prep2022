package revision.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesIArray {

    public static void fimdDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (!set.add(i)) {
                System.out.println(i + "");
            }
        }
    }

    public static void main(String[] args) {
        int numarr[] = {0, 4, 3, 2, 7, 8, 2, 3, 1};
        fimdDuplicates(numarr);
    }
}

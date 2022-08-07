package revision.arrays;

/**/
public class MergeTwoSortedArrays {


    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] resultArray = new int[size1 + size2];
        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                resultArray[k++] = arr1[i++];
            } else {
                resultArray[k++] = arr2[j++];
            }
        }

        // Store remaining elements of first array

        while (i < size1) {
            resultArray[k++] = arr1[i++];
        }
        // Store remaining elements of second array
        while (j < size2) {
            resultArray[k++] = arr2[j++];
        }
        return resultArray;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = mergeArray(arr1, arr2);

        System.out.print("Arrays after merging: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

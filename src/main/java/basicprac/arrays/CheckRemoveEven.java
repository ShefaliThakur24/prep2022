package basicprac.arrays;

public class CheckRemoveEven {

    public static int[] removeEven(int[] arr) {
        int oddelements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                oddelements++;
        }
///Create result array with the size equal to the number of odd elements in arr
        int[] resultarray = new int[oddelements];
        int result_index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                resultarray[result_index++] = arr[i];
        }
        return resultarray;
    }

    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];//declaration and instantiation

        System.out.println("Before removing Even Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;// assigning values
            System.out.println(arr[i] + "");
        }

        int[] newarr = removeEven(arr);
        System.out.print("After removing Even Numbers: ");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " "); // prinitng array
        }

    }
}

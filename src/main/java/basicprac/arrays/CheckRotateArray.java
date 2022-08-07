package basicprac.arrays;

public class CheckRotateArray {
    public static void rotateArray(int[] arr) {
        int lastelement = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i +1];
        }
        arr[arr.length-1] = lastelement;
    }


    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 4, 2};

//        System.out.println("Array before rotation: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + "");
//        }
//
        int k=3;

        for(int i=0;i<k;i++){
            rotateArray(arr);
        }


        System.out.print("Array after rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }}

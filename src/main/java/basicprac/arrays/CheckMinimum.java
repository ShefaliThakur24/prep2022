package basicprac.arrays;

public class CheckMinimum {


    public static int findMinimum(int[] arr)
    {
        int minimum=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<minimum)
            {
                minimum=arr[i];
            }
        }
    return  minimum;
    }

    public static void main(String []args)
    {
        int[] arr={9, 2, 3, 6};
        System.out.println("Array : ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i] +"");
            System.out.println();
        }
int minimum=findMinimum(arr);
        System.out.println("\"Minimum in the Array:" + minimum);
    }
}

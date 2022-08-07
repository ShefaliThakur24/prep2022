package basicprac.String;

import com.sun.jdi.PathSearchingVirtualMachine;

//ON AND O1
public class StringToIntegerWithoutUsingIntegerParseINT {
    public static int convertToInt(String str){
        if(str.length()==1)
        {
            return (int)str.charAt(0) -48;
        }

        char ch[] =str.toCharArray();
        int sum=0;
        int zeroAsc= (int)'0';
        for(int i=0;i<ch.length;i++){
           int asc= (int) ch[i];
           //formula
            sum=sum *10+(asc-zeroAsc);
        }
        return sum;
    }



    public static void main(String[] args) {
        String s= "123";
        System.out.println(convertToInt(s) + 20);
    }
}

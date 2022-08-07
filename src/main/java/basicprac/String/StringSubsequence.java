package basicprac.String;

import com.sun.jdi.PathSearchingVirtualMachine;

public class StringSubsequence {

    //time and space complexity is 0(n) and O(1)
    public static boolean isSubsequence(String s, String t) {
        //two pointers approach
        int slength = s.length();
        int tlength = t.length();

        if (slength == 0)
            return true;
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < slength && tIndex < tlength) {
            if (s.charAt(sIndex) == t.charAt(tIndex))
                sIndex++;


            if (s.length() == sIndex)
                return true;
            tIndex++;
        }
        return false;
    }

    //2nd approach with O(n) space complexity and time complexity as On

    public static boolean isSubsequenceRecursive(String s, String t) {
        return subseqeuenceHelper(s, t, 0, 0);

    }

    public static boolean subseqeuenceHelper(String s, String t, int sIndex, int tIndex) {
        if (s.length() == sIndex) {
            return true;
        }
        if (t.length() == tIndex) {
            return false;

        }
        return s.charAt(sIndex) == t.charAt(tIndex) ? subseqeuenceHelper(s, t, sIndex + 1, tIndex + 1) : subseqeuenceHelper(s, t, sIndex, tIndex + 1);
    }

    public static void main(String[] args) {
        boolean result = isSubsequence("ade", "abcdefgh");
        boolean resultRec = isSubsequenceRecursive("ade", "abcdefgh");
        System.out.println(result);
        System.out.println(resultRec);
    }
}

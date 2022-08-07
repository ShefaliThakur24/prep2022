package basicprac.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
class MyComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();

    }
}
public class PriorityQueueWithStringlength {


    public static void main(String[] args) {
        MyComparator comp = new MyComparator();
        PriorityQueue<String> pr = new PriorityQueue<>(comp);
        pr.add("Naveen");
        pr.add("Naveentest");
        pr.add("Naveen Automation");
        pr.add("N");
        pr.add("Nav");
        pr.add("Na");

        System.out.println(pr.poll());

    }
}

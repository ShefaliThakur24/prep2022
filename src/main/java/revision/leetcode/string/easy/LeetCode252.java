package revision.leetcode.string.easy;


import java.util.Arrays;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

}

public class LeetCode252 {

    public static boolean solution(Interval[] intervals) {
        int start[] = new int[intervals.length];
        int end[] = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        for (int i = 0; i < start.length - 1; i++) {
            if (start[i + 1] < end[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Interval interval[] = new Interval[2];
        interval[0] = new Interval(7,10);
        interval[1] = new Interval(2, 4);
     //   interval[2] = new Interval(15, 20);
        boolean result=solution(interval);
        System.out.println(result);

    }

}

package revision.interviewquestions;

public class StringConsAddition {
    public static void main(String[] args) {
        String s = "aaabcca";
        char[] ch = s.toCharArray();
        int i = 0;

        StringBuilder sb = new StringBuilder();
        while (i < ch.length) {
            int j = i;
            while (j < ch.length && ch[i] == ch[j]) {
                j++;
            }

            sb.append(ch[i]);
            sb.append(j - i);
            i = j;


        }
        System.out.println(sb);

    }
}


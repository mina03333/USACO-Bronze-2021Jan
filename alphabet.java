import java.io.*;
import java.util.*;

public class alphabet {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        /*
         * input: abcdefghijklmnopqrstuvwxyz mood
         */
        String alp = in.next();
        String word = in.next();
        char[] cowAlp = alp.toCharArray();
        char[] cowWord = word.toCharArray();

        int num = 0;
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = num; j < alp.length(); j++) {
                if (cowWord[i] == cowAlp[j]) {
                    i++;
                    if (i >= word.length()) {
                        break;
                    }
                }
            }
            i--;
            count++;
        }

        // System.out.println(Arrays.toString(cowAlp));
        // System.out.println(Arrays.toString(cowWord));

        System.out.println(count);
    }
}
import java.io.*;
import java.util.*;

public class photo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        /*
         * input: 7 1 3 5 7 9 11 13
         */

        int N = in.nextInt();
        int[] cows = new int[N];

        for (int i = 0; i < N; i++) {
            cows[i] = in.nextInt();
        }

        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < N; i++) {
            if (cows[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        int ans = 0;
        if (oddNum + 1 == evenNum || oddNum == evenNum) {
            ans = oddNum + evenNum;
        } else if (oddNum == 0) {
            ans = 1;
        } else if (evenNum > oddNum) {
            ans = oddNum * 2 + 1;
        } else if (oddNum > evenNum) {
            int num = evenNum * 2;
            int remCow = oddNum - evenNum;
            ans = num + ((oddNum - evenNum) * 2) / 3;
            if (remCow % 3 == 1) {
                ans -= 1;
            }
        }

        System.out.println(ans);

        // System.out.println(evenNum + " " + oddNum);

        // System.out.println(Arrays.toString(cows));
    }
}
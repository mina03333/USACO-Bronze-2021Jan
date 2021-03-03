import java.io.*;
import java.util.*;

public class stalls {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        /*
         * input: 4 1 2 3 4 2 4 3 4
         */

        int N = in.nextInt();
        int[] L = new int[N];
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            L[i] = in.nextInt();
        }

        Arrays.sort(L);
        Arrays.sort(H);

        int res = 1;
        for (int i = 0; i < N; i++) {
            int num = 0;
            for (int j = i; j < N; j++) {
                if (L[i] >= H[j]) {
                    num++;
                } else
                    break;

            }
            res *= num;
        }

        System.out.println(res);
    }
}
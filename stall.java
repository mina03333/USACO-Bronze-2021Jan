import java.io.*;
import java.util.*;

public class stall {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        /*
         * input: 4 1 2 3 4 2 4 3 4
         */

        int N = in.nextInt();
        int[] heights = new int[N];
        int[] limits = new int[N];

        for (int i = 0; i < N; i++) {
            heights[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            limits[i] = in.nextInt();
        }

        Arrays.sort(heights);
        Arrays.sort(limits);

        long ans = 1;
        for (int i = 0; i < limits.length; i++) {
            int cnt = 0;
            for (int j = i; j < heights.length; j++) {
                if (heights[j] <= limits[i]) {
                    cnt++;
                } else {
                    break;
                }
            }
            ans *= cnt;
        }

        System.out.println(ans);

        // System.out.println(Arrays.toString(heights));
        // System.out.println(Arrays.toString(limits));

    }
}
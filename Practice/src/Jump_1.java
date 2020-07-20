import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 20/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 * Using FastReader for quick Input/Output
 */
public class Jump_1 {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String args[]) {

        FastReader kb = new FastReader();

        int n = kb.nextInt();

        long p[] = new long[n];
        long a[] = new long[n];
        long h[] = new long[n];

        for (int i = 0; i < n; i++) {
            p[i] = kb.nextLong();
        }

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextLong();
        }

        for (int i = 0; i < n; i++) {
            h[i] = kb.nextLong();
        }

        long dp[] = new long[n];

        dp[0] = a[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Long.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (p[j] < p[i])
                    dp[i] = Math.min(dp[i], dp[j] + ((h[i] - h[j]) * (h[i] - h[j])) + a[i]);
            }
        }

        System.out.println(dp[n - 1]);
    }
}

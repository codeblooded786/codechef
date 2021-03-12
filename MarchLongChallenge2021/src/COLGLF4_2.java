import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 12/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class COLGLF4_2 {

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


    public static void main(String[] args) {

        FastReader kb = new FastReader();

        int t = kb.nextInt();

        while (t-- > 0) {
            int n, e, h, a, b, c;

            n = kb.nextInt();
            e = kb.nextInt();
            h = kb.nextInt();
            a = kb.nextInt();
            b = kb.nextInt();
            c = kb.nextInt();

            int count = 0;
            int mn = Integer.MAX_VALUE;
            int ck = 0;
            for (int k = 0; k <= Math.min(e, h); k++) {

                for (int i = 0; i <= e - k; i += 2) {

                    for (int j = 0; j <= h - k; j += 3) {
                        count += k + i / 2 + j / 3;
                        if (count >= n) {
                            mn = Math.min(c * k + a * (i / 2) + b * (j / 3), mn);
                            ck = count;
                        }
                    }
                    count = 0;
                }

            }
            if (ck < n)
                System.out.println(-1);
            else
                System.out.println(mn);
        }
    }
}

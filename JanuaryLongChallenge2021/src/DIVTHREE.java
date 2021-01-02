import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 01/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class DIVTHREE {

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
        PrintWriter out = new PrintWriter(System.out);

        int t = kb.nextInt();

        while (t-- > 0) {
            int n = kb.nextInt();
            int k = kb.nextInt();
            int d = kb.nextInt();

            int totalProblems = 0;

            for (int i = 0; i < n; i++) {
                totalProblems += kb.nextInt();
            }
            out.println(Math.min(d, totalProblems / k));
        }
        out.flush();
        out.close();
    }
}

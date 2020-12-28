import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class IPCCERT {

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

        int n = kb.nextInt();
        int m = kb.nextInt();
        int k = kb.nextInt();

        PrintWriter out = new PrintWriter(System.out);

        int count = 0;

        while (n-- > 0) {
            int durationOfWatch = 0;
            for (int i = 1; i <= k; i++) {
                int x = kb.nextInt();
                durationOfWatch += x;
            }

            int q = kb.nextInt();

            if (durationOfWatch >= m && q <= 10) {
                count++;
            }
        }
        out.println(count);
        out.flush();
        out.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class FLIP {

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
            String A = kb.next();
            String B = kb.next();

            int ans = 0;
            for (int i = 0; i < A.length(); i += 2) {
                if (A.charAt(i) != B.charAt(i)) {
                    while (i < A.length() && A.charAt(i) != B.charAt(i)) {
                        i += 2;
                    }
                    ans++;
                }
            }

            for (int i = 1; i < A.length(); i += 2) {
                if (A.charAt(i) != B.charAt(i)) {
                    while (i < A.length() && A.charAt(i) != B.charAt(i)) {
                        i += 2;
                    }
                    ans++;
                }
            }

            out.println(ans);
        }
        out.flush();
        out.close();
    }
}

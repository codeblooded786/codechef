import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class SDSTRING {

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
            String s = kb.next();

            long zeroes = s.codePoints().filter(ch -> ch == '0').count();
            long ones = s.codePoints().filter(ch -> ch == '1').count();

            if (zeroes == ones) {
                out.println(0);
            } else if (s.length() % 2 != 0 || zeroes==0 || ones==0) {
                out.println(-1);
            } else {
                out.println((int) Math.abs(zeroes - ones) / 2);
            }
            out.flush();
        }

        out.close();
    }
}

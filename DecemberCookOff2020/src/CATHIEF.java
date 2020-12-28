import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class CATHIEF {

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

        while (t-- > 0)
        {

            int x = kb.nextInt();
            int y = kb.nextInt();
            int K = kb.nextInt();
            int N = kb.nextInt();

            int distanceBetweenThiefandPolice = Math.abs(x - y);

            if (distanceBetweenThiefandPolice%(2*K)==0)
                out.println("Yes");
            else
                out.println("No");
        }
        out.flush();
        out.close();
    }
}

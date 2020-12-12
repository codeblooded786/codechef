import java.io.*;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 11/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class POSPREFS {
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

            if (k > (n + 1) / 2) {
                int negative = n - k;

                for (int i = 1; i < n + 1; i++) {

                    if ((i & 1) == 0 && negative > 0) {
                        out.println(-i);
                        negative--;
                    } else
                        out.println(i);
                }
            } else {
                int positive = k;

                for (int i = 1; i < n + 1; i++) {
                    if ((i & 1) != 0 && positive > 0) {
                        out.println(i);
                        positive--;
                    } else {
                        out.println(-i);
                    }
                }
            }
            out.flush();
        }
        out.close();
    }
}


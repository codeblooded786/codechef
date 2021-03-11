import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 06/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class GROUPS {

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
            String s = kb.next();

            int groups = 0;

            int length = s.length();
            int i = 0;
            while (i < length) {

                while (i < length && s.charAt(i) == '0') {
                    i++;
                }

                if (i < length && s.charAt(i) == '1') {
                    groups++;
                }

                while (i < length && s.charAt(i) == '1') {
                    i++;
                }
            }

            System.out.println(groups);

        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 11/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class IRSTXOR {

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
            int x = kb.nextInt();

            String binary = Integer.toBinaryString(x);

            String num1 = "1";
            String num2 = "0";

            for (int i = 1; i < binary.length(); i++) {

                if (binary.charAt(i) == '1') {
                    num1 += "0";
                    num2 += "1";
                } else {
                    num1 += "1";
                    num2 += "1";
                }
            }

            System.out.println(Integer.parseInt(num1, 2) * Integer.parseInt(num2, 2));

        }
    }
}

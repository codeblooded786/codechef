import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 06/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class NOTIME {

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
        int h = kb.nextInt();
        int x = kb.nextInt();

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            int temp = kb.nextInt();

            if (temp + x >= h) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

import java.io.*;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 12/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class HXOR {

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

    public static void main(String[] args) throws IOException {

        FastReader kb = new FastReader();

        PrintWriter out = new PrintWriter(System.out);

        int t = kb.nextInt();

        while (t-- > 0) {
            int n = kb.nextInt();
            int x = kb.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int i = 0;
            int k, z = -1;
            for (k = x; k > 0 && i < n - 1; k--) {

                int flag = 0;

                int p = (int) (Math.log(arr[i]) / Math.log(2));
                int r = 1 << p;

                arr[i] = arr[i] ^ r;

                for (int j = i + 1; j < n; j++) {

                    if (arr[j] > (arr[j] ^ r)) {
                        arr[j] = arr[j] ^ r;
                        flag = 1;
                        break;
                    }

                }
                if (flag == 0) {
                    arr[n - 1] = arr[n - 1] ^ r;
                }

                while (arr[i] <= 0) {
                    i++;
                }
                z = k + 1;
            }


            if (z > 0) {
                if (n < 3 && (z & 1) > 0) {
                    arr[n - 1] = arr[n - 1] ^ 1;
                    arr[n - 2] = arr[n - 2] ^ 1;
                }
            }


            for (i = 0; i < n; i++) {
                out.write(arr[i] + " ");
            }
        }
        out.close();
    }
}

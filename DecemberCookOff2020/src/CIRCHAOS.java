import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class CIRCHAOS {

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

        long t = kb.nextInt();

        while (t-- > 0) {
            long n = kb.nextLong();
            int m = kb.nextInt();

            long arr[] = new long[m];

            for (int i = 0; i < m; i++) {
                arr[i] = kb.nextLong();
            }
            long count = 0;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                long x = arr[i];
                if (arr[i] > n && arr[i] % n != 0) {
                    x = arr[i] % n;

                }
                if (n > x) {
                    count = count + (n - x);
                    n = n - (n - x);
                }
            }
            out.println(count);
        }
        out.flush();
        out.close();
    }
}


//            for (int i = 1; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    int x = arr[j];
//                    if (arr[j] > n && arr[j] % n != 0) {
//                        x = arr[j] % n;
//                    }
//
//                    if ((i) % x == 0) {
//                        count = count + (n - x);
//                        n = n - (n - x);
//                        i = 0;
//                        break;
//                    }
//                }
//            }

//            for (int i = 1; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if ((arr[j] - i) % n == 0) {
//                        count++;
//                        n--;
//                        i = 0;
//                        break;
//                    }
//                }
//            }
//class AP {
//    int firstTerm;
//    int commonDifference;
//
//    public AP(int firstTerm, int commonDifference) {
//        this.firstTerm = firstTerm;
//        this.commonDifference = commonDifference;
//    }



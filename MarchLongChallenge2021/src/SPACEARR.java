import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 11/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class SPACEARR {

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

        long t = kb.nextInt();

        while (t-- > 0) {
            int n = kb.nextInt();

            int arr[] = new int[n];
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
                if (arr[i] > n) {
                    flag = true;
                    System.out.println("Second");
                    break;
                }
            }

            if (flag == false) {

                long sum1 = IntStream.range(1, n + 1).reduce(0, Integer::sum);

                long sum2 = Arrays.stream(arr).reduce(0, Integer::sum);

                Arrays.sort(arr);
                boolean flag2 = false;
                for (int i = 1; i < n + 1; i++) {
                    if (arr[i - 1] > i) {
                        System.out.println("Second");
                        flag2 = true;
                    }
                }

                if (flag2 == false) {
                    if (sum2 > sum1) {
                        System.out.println("Second");
                    } else {
                        if ((sum1 - sum2) % 2 == 1) {
                            System.out.println("First");
                        } else {
                            System.out.println("Second");
                        }
                    }
                }
            }

        }
    }

}

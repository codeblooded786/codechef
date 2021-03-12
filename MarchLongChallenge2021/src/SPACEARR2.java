import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 12/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class SPACEARR2 {

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
            int n = kb.nextInt();

            int arr[] = new int[n];


            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            Arrays.sort(arr);

            long sum = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] > i + 1) {
                    flag = true;
                    break;
                }
                sum += i + 1 - arr[i];
            }

            if (flag == true)
                System.out.println("Second");
            else {
                if (sum % 2 == 0) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }
        }


    }
}

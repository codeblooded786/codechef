import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 20/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Jump {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        long p[] = new long[n];
        long a[] = new long[n];
        long h[] = new long[n];

        for (int i = 0; i < n; i++) {
            p[i] = kb.nextLong();
        }

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextLong();
        }

        for (int i = 0; i < n; i++) {
            h[i] = kb.nextLong();
        }

        long dp[] = new long[n];

        dp[0] = a[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Long.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (p[j] < p[i])
                    dp[i] = Math.min(dp[i], dp[j] + ((h[i] - h[j]) * (h[i] - h[j])) + a[i]);
            }
        }

        System.out.println(dp[n - 1]);
    }
}

import java.util.Scanner;

/**
 * @project hackerrank
 * Created by @author Rahul Dev Gupta on 29/11/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class XORCOMP {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();
        long x, y, n;
        long count;

        while (t-- > 0) {
            x = kb.nextInt();
            y = kb.nextInt();
            n = kb.nextInt();
            count = 0;
            for (long i = 0; i <= n; i++) {

                if ((x ^ i) < (y ^ i)) {
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}

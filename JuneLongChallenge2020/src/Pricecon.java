import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 06/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Pricecon {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();
        int n, k, x, actualSum, alteredSum;

        while (t-- > 0) {
            n = kb.nextInt();
            k = kb.nextInt();
            actualSum = alteredSum = 0;

            for (int i = 0; i < n; i++) {
                x = kb.nextInt();
                actualSum += x;
                if (x > k)
                    alteredSum += k;
                else
                    alteredSum += x;
            }
            System.out.println(actualSum - alteredSum);
        }
    }
}

import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 24/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class CacheHit {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();
        int n, b, m, x;
        int count;
        int blockNo, lowerLimit, upperLimit;

        while (t-- > 0) {
            n = kb.nextInt();
            b = kb.nextInt();
            m = kb.nextInt();
            count = 1;
            x = kb.nextInt();
            blockNo = x / b + 1;
            lowerLimit = b * (blockNo - 1);
            upperLimit = b * blockNo - 1 > n - 1 ? n - 1 : b * blockNo - 1;
            m--;

            while (m-- > 0) {
                x = kb.nextInt();
                if (x >= lowerLimit && x <= upperLimit)
                    continue;
                else {
                    blockNo = x / b + 1;
                    lowerLimit = b * (blockNo - 1);
                    upperLimit = b * blockNo - 1 > n - 1 ? n - 1 : b * blockNo - 1;
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}

import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 06/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Xystr {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        String s;
        int i, countPair;

        while (t-- > 0) {
            s = kb.next();

            i = 0;
            countPair = 0;

            while (i < s.length() - 1) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    countPair++;
                    i += 2;
                } else
                    i += 1;
            }

            System.out.println(countPair);
        }
    }
}

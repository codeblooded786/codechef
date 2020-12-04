import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 02/11/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Andor {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        long x;

        while (t-- > 0) {
            try {
                x = kb.nextLong();
                System.out.println("0 " + x);
            } catch (Exception e) {
                return;
            }
        }
    }
}

import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 05/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class VACCINE2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();

        while (t-- > 0) {
            int peopleAtRisk = 0;
            int n = kb.nextInt();
            int d = kb.nextInt();

            for (int i = 0; i < n; i++) {
                int x = kb.nextInt();
                if (x >= 80 || x <= 9) {
                    peopleAtRisk++;
                }
            }
            System.out.println((int) (Math.ceil(peopleAtRisk / (double) d)
                    + Math.ceil((n - peopleAtRisk) / (double) d)));
        }
    }
}

import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 05/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class VACCINE1 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int D1 = kb.nextInt();
        int V1 = kb.nextInt();
        int D2 = kb.nextInt();
        int V2 = kb.nextInt();
        int P = kb.nextInt();

        int totalVaccines = 0;
        int daysCount = 0;
        while (totalVaccines < P) {
            daysCount++;
            if (daysCount >= D1) {
                totalVaccines += V1;
            }
            if (daysCount >= D2) {
                totalVaccines += V2;
            }
        }
        System.out.println(daysCount);
    }
}

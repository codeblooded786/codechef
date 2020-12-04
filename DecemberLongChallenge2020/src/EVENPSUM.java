import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 05/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class EVENPSUM {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        while (t-- > 0) {
            long a = kb.nextInt();
            long b = kb.nextInt();

            long noOfEvenIntegersA = a / 2;
            long noOfOddIntegersA = a - noOfEvenIntegersA;

            long noOfEvenIntegersB = b / 2;
            long noOfOddIntegersB = b - noOfEvenIntegersB;

            System.out.println(noOfEvenIntegersA * noOfEvenIntegersB + noOfOddIntegersA * noOfOddIntegersB);
        }
    }
}

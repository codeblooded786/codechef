import java.util.Scanner;

/**
 * @project hackerrank
 * Created by @author Rahul Dev Gupta on 29/11/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class FRCTNS {

    public static boolean checkGood(int i, int j) {
        int numerator = i * (j + 1);
        int denominator = (i + 1) * j;

        int gcd = FRCTNS.gcd(numerator, denominator);

        numerator = numerator / gcd;
        denominator = denominator / gcd;

        return denominator - numerator == 1 ? true : false;

    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = i + 1; j <= n; j++) {
                if (checkGood(i, j)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

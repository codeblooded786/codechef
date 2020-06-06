import java.math.BigInteger;
import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 06/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Eoeo {
    public static BigInteger two = new BigInteger("2");

    public static BigInteger powerOfTwo(BigInteger num) {
        BigInteger twos = BigInteger.ZERO;

        while (num.mod(two) == BigInteger.ZERO) {
            twos = twos.add(BigInteger.ONE);
            num = num.divide(two);
        }
        return twos;
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        BigInteger ts, twos;
//        double result;

        BigInteger result;

        while (t-- > 0) {
            ts = kb.nextBigInteger();

            if (ts.mod(two) != BigInteger.ZERO) {
                System.out.println(ts.divide(two));
            } else {
                twos = powerOfTwo(ts);

                /*result = ts.subtract(BigInteger.valueOf(1l)).intValue() / (Math.pow(BigInteger.valueOf(2l).intValue(), twos.add(BigInteger.valueOf(1l)).intValue()));
                result = ts.subtract(BigInteger.valueOf(1l)).divide(Math.pow(BigInteger.valueOf(2l), twos.add(BigInteger.valueOf(1l))));
                ts.subtract(BigInteger.valueOf(1l)).divide(Math.pow(BigInteger.valueOf(2l), twos.add(BigInteger.valueOf(1l))));

                BigInteger x = two.pow(twos.add(BigInteger.valueOf(1l)).intValue());
                BigInteger y = ts.subtract(BigInteger.valueOf(1l)).divide(x);*/

                result = ts.subtract(BigInteger.valueOf(1l)).divide(two.pow(twos.add(BigInteger.valueOf(1l)).intValue()));
                System.out.println(result);
            }
        }
    }
}

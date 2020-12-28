import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 09/11/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class Adadish {


    public static void main(String[] args) {
        int t, n;
        Scanner kb = new Scanner(System.in);
        int arr[];
        t = kb.nextInt();

        while (t-- > 0) {
            n = kb.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Arrays.sort(arr);

            int b1, b2;
            int i = 0, j = arr.length;

            while (i < j) {

            }
        }
    }
}

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.Scanner;

/**
 * @project hackerrank
 * Created by @author Rahul Dev Gupta on 28/11/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class BEGGASOL {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();
        int n;
        int arr[];

        while (t-- > 0) {
            n = kb.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            int count = 0;
            int distance = 0;
            for (int i = 0; i < n; i++) {
                count += arr[i];
                distance += arr[i];
                if (count == 0)
                    break;
                count--;
            }
            System.out.println(distance);
        }
    }
}

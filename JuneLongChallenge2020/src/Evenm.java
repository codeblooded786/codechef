import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 07/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Evenm {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        int n, i, flag, counter;

        while (t-- > 0) {
            n = kb.nextInt();
            i = 1;
            counter = 1;
            flag = 0;
            while (i <= n * n) {
                System.out.print(i + " ");

                if (counter % n == 0) {
                    System.out.println();
                    flag++;
                    if (flag % 2 != 0)
                        i = i + n + 1;
                    else
                        i = counter;
                }

                if (flag % 2 == 0)
                    i++;
                if (flag % 2 == 1)
                    i--;

                counter++;
            }
        }

        /*while (t-- > 0) {
            n = kb.nextInt();
            arr = new int[n][n];
            x = 1;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = x++;
                    }
                else
                    for (int j = n - 1; j >= 0; j--) {
                        arr[i][j] = x++;
                    }
            }
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }*/
    }
}

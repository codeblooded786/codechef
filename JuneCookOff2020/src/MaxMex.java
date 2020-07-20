import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 24/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class MaxMex {

    public static void main (String args[])
    {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();
        int n,m,i;
        int arr[];

        while (t-- > 0)
        {
            i=0;
            n=kb.nextInt();
            m=kb.nextInt();
            arr = new int[n];

            while (n-->0)
            {
                arr[i++]=kb.nextInt();
            }

            Arrays.sort(arr);

            int mex=1;

            for(i=0;i<arr.length;i++)
            {
                if (arr[i]!=i+1)
                    break;

            }
            mex=i+1;

            if (mex==m)
                System.out.println(arr.length);

            else if (mex<m)
                System.out.println("-1");
            else
            {
                int frequncy=0;
                for (i=0;i<arr.length;i++)
                {
                    if (arr[i]==m)
                        frequncy++;
                }

                System.out.println();

            }






        }

    }

}

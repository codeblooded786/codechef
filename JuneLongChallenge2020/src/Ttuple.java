import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 07/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Ttuple {

    public static void main(String args[]) throws IOException {
        Scanner kb = new Scanner(System.in);

        Integer operations, x;

        List<Integer> input = new ArrayList<>();
        List<Integer> target = new ArrayList<>();
        List<Integer> difference = new ArrayList<>();

        Integer t = kb.nextInt();
        try {


            while (t-- > 0) {
                operations = 3;
                input.clear();
                target.clear();
                difference.clear();

                for (int i = 0; i < 3; i++) {
                    x = kb.nextInt();
                    input.add(x);
                }
                for (int i = 0; i < 3; i++) {
                    x = kb.nextInt();
                    target.add(x);
                }
                for (int i = 0; i < 3; i++) {
                    x = target.get(i) - input.get(i);
                    difference.add(x);
                }

            /*for (int i = 0; i < 3; i++)
                System.out.print(difference.get(i) + " ");*/


                if (difference.contains(0)) {
                    operations -= Collections.frequency(difference, 0);
                }


                if (operations == 1) {
                    System.out.println(operations);
                    continue;
                } else if (operations == 2) {
                    if (difference.get(0).equals(difference.get(1)) || difference.get(1).equals(difference.get(2)) || difference.get(0).equals(difference.get(2))) {
                        operations--;
                        System.out.println(operations);
                        continue;
                    }

                    if (((difference.get(0) / input.get(0)) == (difference.get(1) / input.get(1)) && (difference.get(0) % input.get(0)) == 0 && (difference.get(1) % input.get(1)) == 0) ||

                            ((difference.get(1) / input.get(1)) == (difference.get(2) / input.get(2)) && (difference.get(1) % input.get(1)) == 0 && (difference.get(2) % input.get(2)) == 0) ||

                            ((difference.get(0) / input.get(0)) == (difference.get(2) / input.get(2)) && (difference.get(0) % input.get(0)) == 0 && (difference.get(2) % input.get(2)) == 0)
                    ) {
                        operations--;
                        System.out.println(operations);
                        continue;
                    }

                } else if (operations == 3) {
                    if (difference.get(0) == difference.get(1) && difference.get(1) == difference.get(2)) {
                        operations = 1;
                        System.out.println(operations);
                        continue;
                    } else if (difference.get(0).equals(difference.get(1)) ||
                            difference.get(1).equals(difference.get(2)) ||
                            difference.get(0).equals(difference.get(2))
                    ) {
                        operations = 2;
                        System.out.println(operations);
                        continue;
                    } else if (difference.get(0) / input.get(0) == difference.get(1) / input.get(1) &&
                            difference.get(1) / input.get(1) == difference.get(2) / input.get(2) &&
                            (difference.get(0) % input.get(0)) == 0 && (difference.get(1) % input.get(1)) == 0 &&
                            (difference.get(2) % input.get(2)) == 0) {
                        operations = 1;
                        System.out.println(operations);
                        continue;
                    } /*else if (difference.get(0) / input.get(0) == difference.get(1) / input.get(1) ||
                        difference.get(1) / input.get(1) == difference.get(2) / input.get(2) ||
                        difference.get(0) / input.get(0) == difference.get(2) / input.get(2))*/ else if (((difference.get(0) / input.get(0)) == (difference.get(1) / input.get(1)) && (difference.get(0) % input.get(0)) == 0 && (difference.get(1) % input.get(1)) == 0) ||

                            ((difference.get(1) / input.get(1)) == (difference.get(2) / input.get(2)) && (difference.get(1) % input.get(1)) == 0 && (difference.get(2) % input.get(2)) == 0) ||

                            ((difference.get(0) / input.get(0)) == (difference.get(2) / input.get(2)) && (difference.get(0) % input.get(0)) == 0 && (difference.get(2) % input.get(2)) == 0)
                    ) {
                        operations = 2;
                        System.out.println(operations);
                        continue;
                    } else
                        System.out.println(operations);

                }


            }
        } catch (Exception e) {
            return;
        }




        /*int operations;
        int input[] = new int[3];
        int target[] = new int[3];
        int difference[] = new int[3];
        int t = kb.nextInt();

        while (t-- > 0) {
            operations = 3;

            for (int i = 0; i < 3; i++)
                input[i] = kb.nextInt();

            for (int i = 0; i < 3; i++)
                target[i] = kb.nextInt();

            for (int i = 0; i < 3; i++)
                difference[i] = target[i] - input[i];

            if (difference[0] == 0 || difference[1] == 0 || difference[2] == 0)
            {

            }


        }*/

    }

}

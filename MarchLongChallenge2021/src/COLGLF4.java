import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 12/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class COLGLF4 {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void main(String[] args) {
        FastReader kb = new FastReader();

        int t = kb.nextInt();

        while (t-- > 0) {
            final int n, e, h, a, b, c;

            n = kb.nextInt();
            e = kb.nextInt();
            h = kb.nextInt();
            a = kb.nextInt();
            b = kb.nextInt();
            c = kb.nextInt();

            int maxCake, maxOmelette, maxMilkshake;

            maxCake = h / 3;
            maxMilkshake = Math.min(e, h);
            maxOmelette = e / 2;


            Map<String, Integer> matrix = new HashMap<>();

            matrix.put("omelette", a);
            matrix.put("milkshake", b);
            matrix.put("cake", c);

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(matrix.entrySet());

            Collections.sort(entries, Comparator.comparing(Map.Entry::getValue));

            Map map = new LinkedHashMap<>();

            for (Map.Entry entry : entries) {
                map.put(entry.getKey(), entry.getValue());
            }


            List<String> list = new ArrayList(map.keySet());
            int omelette = 0;
            int milkshake = 0;
            int cake = 0;
            int eggsLeft = e;
            int chocLeft = h;

            while (true) {
                String dish1 = list.get(0);

                if (dish1.equals("omelette")) {
                    omelette = eggsLeft / 2;
                    eggsLeft = e - (omelette * 2);
                    chocLeft = h;

                    if (omelette >= n) {
                        System.out.println(omelette);
                        break;
                    }

                    String dish2 = "milkshake";
                    {

                    }
                } else if (dish1.equals("milkshake")) {
                    milkshake = maxMilkshake;
                    eggsLeft = 0;
                    chocLeft = 0;

                } else {

                }

            }

        }
    }
}

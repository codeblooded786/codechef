import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @project codechef
 * Created by @author Rahul Dev Gupta on 12/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class STROPERS {
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

    public static int countOnes(String s) {
        int countOne = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                countOne++;
            }
        }
        return countOne;
    }

    public static void main(String[] args) {

        FastReader kb = new FastReader();

        int t = kb.nextInt();

        while (t-- > 0) {

            String s = kb.next();
            Map<Integer, List<String>> matrix = new TreeMap<>(Collections.reverseOrder());

            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {

                    String subString = s.substring(i, j);
                    if (matrix.containsKey(subString.length())) {
                        List<String> stringList = matrix.get(subString.length());
                        stringList.add(subString);
                        matrix.put(subString.length(), stringList);
                    } else {
                        List<String> strings = new ArrayList<>();
                        strings.add(subString);
                        matrix.put(subString.length(), strings);
                    }
                }
            }


            int count = 0;

            // List<Map<Integer, List<String>>> mapList = new ArrayList<>();
            List<Map<Integer, Map<Integer, List<String>>>> mapList = new ArrayList<>();
            for (Map.Entry<Integer, List<String>> entry : matrix.entrySet()) {
                if (entry.getValue().size() == 1) {
                    count++;
                } else {
                    List<String> stringList = entry.getValue();

                    Map<Integer, Map<Integer, List<String>>> map = new TreeMap<>();
                    for (String str : stringList) {

                        if ((STROPERS.countOnes(str) & 1) != 0) {
                            count++;
                        } else {
                            if (map.containsKey(str.length())) {

                                Map<Integer, List<String>> integerListMap = map.get(str.length());

                                if (integerListMap.containsKey(STROPERS.countOnes(str))) {
                                    List<String> list = integerListMap.get(STROPERS.countOnes(str));
                                    list.add(str);
                                    integerListMap.put(STROPERS.countOnes(str), list);
                                } else {
                                    List<String> stringList1 = new ArrayList<>();
                                    stringList1.add(str);
                                    integerListMap.put(STROPERS.countOnes(str), stringList1);
                                }

//                                List<String> stringList1 = map.get(str.length());
//                                stringList1.add(str);
//                                map.put(str.length(), stringList1);
                            } else {
                                Map<Integer, List<String>> map1 = new HashMap<>();
                                List<String> strList1 = new ArrayList<>();
                                strList1.add(str);
                                map1.put(STROPERS.countOnes(str), strList1);
                                map.put(str.length(), map1);
//                                List<String> strings = new ArrayList<>();
//                                strings.add(str);
//                                map.put(str.length(), strings);
                            }
                        }
                    }
                    mapList.add(map);
                }
            }

            for (Map<Integer, Map<Integer, List<String>>> map : mapList) {

                for (Map.Entry<Integer, Map<Integer, List<String>>> entry : map.entrySet()) {
                    for (Map.Entry<Integer, List<String>> entry1 : entry.getValue().entrySet()) {
                        if (entry1.getValue().size() == 1) {
                            count++;
                        }
                    }
                }
            }

            System.out.println();
        }
    }
}

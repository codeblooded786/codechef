import java.util.*;

/**
 * @project JanuaryLongChallenge2021
 * Created by @author Rahul Dev Gupta on 03/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo {

//    int x;
//
//    public Demo(int x) {
//        this.x = x;
//    }
//
//    @Override
//    public String toString() {
//        if (x == 0) {
//            return null;
//        } else
//            return "" + x;
//    }

    //    public static void calculate(int x) {
//        String val;
//
//        switch (x) {
//            case 2:
//            default:
//                val = "def";
//        }
//
//        System.out.println(val);
//    }

    public void testRefs(String str, StringBuilder sb) {
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
    }

    void test(int... x) {
        Map<Integer, Integer> map = new HashMap<>();

        LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<>();

//        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
//                .forEachOrdered(x -> map1.put(x.getKey(), x.getValue()));

    }

    public static void main(String[] args) {

        String s = "aaa";

        StringBuilder sb = new StringBuilder("bbb");

        new Demo().testRefs(s, sb);

        System.out.println(s + " " + sb);

        float f = 1f;


//        ArrayList<String> al = new ArrayList<>();
//        al.add("111");
//        al.add("222");
//        System.out.println(al.get(al.size()));

//        calculate(2);

//        Demo d1 = new Demo(0);
//        Demo d2 = new Demo(2);
//
//        System.out.println(d2);
//        System.out.println("" + d1);
    }
}

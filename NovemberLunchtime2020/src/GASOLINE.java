import java.util.*;
import java.util.stream.Collectors;

/**
 * @project hackerrank
 * Created by @author Rahul Dev Gupta on 28/11/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class GASOLINE {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        long t = kb.nextInt();
        int n;
        int arr[];
        int brr[];

        List<MyData> myDataList = new ArrayList<>();

        while (t-- > 0) {
            myDataList.clear();
            n = kb.nextInt();
            arr = new int[n];
            brr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            for (int i = 0; i < n; i++) {
                brr[i] = kb.nextInt();
            }

            for (int i = 0; i < n; i++) {
                MyData myData = new MyData(arr[i], brr[i]);
                myDataList.add(myData);
            }

            List<MyData> sortedList = myDataList.stream()
                    .sorted(Comparator.comparing(MyData::getY)).collect(Collectors.toList());

            long distance = 0;
            long coin = 0;

            for (MyData data : sortedList) {

                long x = Math.min(data.getX(), n - distance);
                distance += x;
                coin += x * data.getY();

                if (distance == n)
                    break;
            }
            System.out.println(coin);
        }
    }
}

class MyData {
    long x;
    long y;

    public MyData(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return x == myData.x &&
                y == myData.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

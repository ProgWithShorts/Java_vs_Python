import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        int nums = 0;
        while (nums < 5_000_000) {
            list.add(nums);
            nums++;
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + " ms");
    }
}

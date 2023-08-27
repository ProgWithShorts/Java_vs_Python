import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        int arr[] = new int[5_000_000];

        int nums = 0;
        while (nums < 5_000_000) {
            arr[nums] = nums;
            nums++;
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + " ms");
    }
}

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4};
        int[] arr1 = {2, 2, 0};
        int[] arr2 = {1, 3, 5};
        System.out.println(Arrays.toString(arr) + " -> " + countEvens(arr));
        System.out.println(Arrays.toString(arr1) + " -> " + countEvens(arr1));
        System.out.println(Arrays.toString(arr2) + " -> " + countEvens(arr2));
    }

    public static int countEvens(int[] arr) {
        int count = 0;
        for (var i: arr) {
            if(i % 2 == 0) count++;
        }
        return count;
    }
}

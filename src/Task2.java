public class Task2 {
    public static void main(String[] args) {
        int[] arr = {4, 90, 20, 12, 80};
        System.out.println(diffMaxMin(arr));
    }
    public static int diffMaxMin(int[] arr) {
            int min = arr[0], max = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                if (max < arr[i + 1]) max = arr[i+1];
                else if (min > arr[i+1]) min = arr[i+1];
            }
        return max - min;
    }
}

import com.sun.source.tree.BreakTree;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {7,5,9,0,0};
        System.out.println(zeroRow(arr));
    }

    public static boolean zeroRow(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) return true;
        }
        return false;
    }
}

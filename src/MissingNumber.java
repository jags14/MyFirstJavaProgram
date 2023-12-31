import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumber {

    static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i < (n + 1); i++) {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        // Function call
        System.out.println(getMissingNo(nums, n));
    }
}

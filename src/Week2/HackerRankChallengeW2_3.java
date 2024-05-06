package Week2;
import java.util.Scanner;
/*
[-2]
[-2, 4, -5]
[-5]
[1, -2, 4, -5]
[-2, 4]
[4, -5]
[-2, 4, -5, 1]
[1]
[1, -2, 4, -5, 1]
 */

public class HackerRankChallengeW2_3 {

    public static int countNegativeSubarrays(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;

        //int[] arr = {1, -2, 4, -5, 1};
        int[] arr = {5, -6, 5, -2 , 5};

        int negativeSubarrays = countNegativeSubarrays(arr);
        System.out.println(negativeSubarrays);

    }
}

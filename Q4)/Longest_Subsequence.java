import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Longest_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the arrays:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(arr[0]);
        list2.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } 
            else if (arr[i] == arr[i - 1] + 1) {
                list1.add(arr[i]);
            }
            else {
                list1.clear();
                list1.add(arr[i]);
            }

            if (list1.size() > list2.size()) {
                list2.clear();
                list2.addAll(list1);
            }
        }

        System.out.println("The longest subsequence is of the length " + list2.size());
        System.out.println("The arrays of the subsequence is: " + list2);
    }
}
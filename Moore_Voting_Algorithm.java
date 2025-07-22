import java.util.Scanner;

public class Moore_Voting_Algorithm {

    public static int moore_Voting(int[] arr) {
        int count = 0;
        int candidate = -1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
            else {
                if (arr[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == candidate) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int value = moore_Voting(arr);
        if (value != -1) {
            System.out.println("The element with more than N/2 occurrence is: " + value);
        } else {
            System.out.println("No majority element found.");
        }
    }
}

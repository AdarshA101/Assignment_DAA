import java.util.Arrays;
import java.util.Scanner;

public class Merge_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the array1!");
        int []arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array2:");
        int n2 = sc.nextInt();
        System.out.println("Enter the array2!");
        int []arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int ptr1 = n1-1;
        int ptr2 = 0;

        while(ptr1>0 && ptr2<n2){
            if(arr1[ptr1]>arr2[ptr2]){
                int temp = arr1[ptr1];
                arr1[ptr1] = arr2[ptr2];
                arr2[ptr2] = temp;
            }
            else{
                break;
            }
            ptr1--;
            ptr2++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Merged sorted array is:");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+"\t");
        }
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+"\t");
        }
    }
}
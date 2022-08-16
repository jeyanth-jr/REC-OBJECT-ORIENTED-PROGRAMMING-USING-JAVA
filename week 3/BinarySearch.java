import java.util.Scanner;
public class BinarySearch {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int x = sc.nextInt(), flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("element " + x + " found at " + i+1);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found in array");
        }
    }
}
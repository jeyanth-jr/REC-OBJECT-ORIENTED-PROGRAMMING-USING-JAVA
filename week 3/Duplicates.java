import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array");
        int n = sc.nextInt(), c = 0;
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr2[0] = arr[0];
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr2[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                arr2[c] = arr[i];
                c++;
            }
        }
        for(int i=0;i<c;i++){
            System.out.print(arr2[i]+ " ");
        }
    }
}
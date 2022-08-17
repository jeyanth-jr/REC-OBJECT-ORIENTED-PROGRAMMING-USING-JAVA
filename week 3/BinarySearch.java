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
        int x = sc.nextInt(), flag = 0,f=0,l=n-1,mid;
        while(f<=l){
            mid=(f+l)/2;
            if(arr[mid]==x){
                flag=1;
                break;
            }
            else if(arr[mid]<x){
                f=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("element found at " + mid");
        }                       
    }
}

import java.util.Scanner;
public class sum {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0,sum=0;
        while(i<4){
            System.out.println("Enter a no");
            int a=sc.nextInt();
            sum=sum+a;
            i++;
        }
        System.out.println("Sum of given 4 nos is "+sum);
    }
}
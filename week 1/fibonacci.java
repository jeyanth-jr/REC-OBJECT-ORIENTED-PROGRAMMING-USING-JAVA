import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,s=0,t=1;
        if(n==0){
            System.out.println(s);
            System.out.println(t);
        }
        else{
            System.out.println(s);
            do{
                System.out.println(t);
                f=s;
                s=t;
                t=f+s;
            }while(t<n);
        }
    }
}
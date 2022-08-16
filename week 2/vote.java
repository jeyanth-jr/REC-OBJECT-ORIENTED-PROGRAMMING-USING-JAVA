import java.util.Scanner;
public class vote {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a<18){
            System.out.println("not eleigible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
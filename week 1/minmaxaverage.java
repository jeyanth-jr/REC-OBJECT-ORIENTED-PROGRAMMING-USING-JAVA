import java.util.Scanner;
public class minmaxaverage {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,min,max,average;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b){
            max=b;
            min=a;
        }
        else{
            min=b;
            max=a;
        }
        average=(a+b)/2;
        System.out.println("Minimum is "+min+" Maximum is "+max+" Average is "+average);
    }
}
import java.util.Scanner;
class Arithematic{
      int sum(int a,int b){
           return a+b;
     }
}
class Adder extends Arithematic{
}
class Multiplication extends Arithematic{
}
class Division extends Arithematic{
}
class Main{
   public static void main(String[] args){
      Adder obj= new Adder();
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(obj.sum(a,b));
   }
}
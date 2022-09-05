/*To find out the state of the vehicles(speed and gear) to create an interface vehicle and define the abstract methods
•	create a  class bicycle which implements vehicle and calculate the gear and speed of bicycle
•	create a class bike which implements vehicle and calculate the gear and speed of bike
•	creat another class which calls the method in above class
*/

import java.util.Scanner;
interface vehicles{
    void speed(int n);
}
class bicycle implements vehicles {
    public void speed(int n){
        if(n>0 && n<=10){
            System.out.println("first gear");
        }
        else if(n>10 && n<20){
            System.out.println("Second gear");
        } else if (n>20 && n<60) {
            System.out.println("Third gear");
        }
        else if(n>60 && n<90){
            System.out.println("Fourth gear");
        }
        else{
            System.out.println("Fifth gear");
        }
        System.out.println("speed:" + n);
    }
}
class bike extends bicycle implements vehicles {
}
class Main{
    public static  void main(String[] args){
        bicycle obj1=new bicycle();
        obj1.speed(50);
        bike obj2=new bike();
        obj2.speed(65);
    }
}
/*abc is a contendor for valedictory n after high school. She wants to know how many students have scored higher than her in the 5 exams. Given during this semester.... create a class name student wth the following spectification..... and instance variable named scoresto hold a students' 5 scores..... a void input fn that reads 5 integers and saves them to scores an int calculate total function that returns the sum of the students scores...

input format:
first line contains n no. of students in abc class
subsequent lines of llines contains each student 5 exam grades for the semester

sample input:
3
30 40 45 10 10        135
40 40 40 10 10        140
50 20 30 10 10        120*/

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Student obj=new Student();
        obj.GetInputs();
        System.out.println(obj.GetTotal());

    }
}
class Student{
    static int[] arr=new int[5];
    void GetInputs() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Student.arr[i] = sc.nextInt();
        }
    }
    int GetTotal(){
        int sum = 0;
        for(int i=0;i<5;i++){
            sum=sum+Student.arr[i];
        }
        return sum;
    }
}

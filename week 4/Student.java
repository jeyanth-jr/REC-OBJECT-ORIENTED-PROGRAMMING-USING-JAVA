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
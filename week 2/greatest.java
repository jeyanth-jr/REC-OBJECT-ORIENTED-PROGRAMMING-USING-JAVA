public class greatest {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if (n1 >= n2) {
            if (n1 >= n3)
                System.out.println("the largest number is "+ n1);
            else
                System.out.println("the largest number is "+ n3);
        }
        else {
            if (n2 >= n3)
                System.out.println("largest number is "+ n2);
            else
                System.out.println("largest number is "+ n3);
        }
    }
}
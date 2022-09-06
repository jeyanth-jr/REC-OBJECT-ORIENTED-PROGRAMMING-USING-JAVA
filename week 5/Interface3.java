interface polygon{
    class Square{
        void area(int n){}
    }
    class Rectangle{
        void area(int l,int b){}
    }
}
class Square implements polygon{
    void area(int n){
        System.out.println("Area: "+n*n);
    }
}
class Rectangle implements polygon{
    void area(int l,int b){
        System.out.println("Area: "+ l*b);
    }
}
public class Main {
    public static void main(String[] args) {
        Square square=new Square();
        Rectangle rectangle=new Rectangle();
        square.area(5);
        rectangle.area(5,6);
    }
}

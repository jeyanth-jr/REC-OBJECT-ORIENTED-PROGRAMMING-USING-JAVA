class Animal{
   void walk(){
       System.out.println("I'm walking");
   }
}
class Bird extends Animal{
    void  fly(){
       System.out.println("I'm flying");
   }
   void  sing(){
       System.out.println("I'm singing");
   }
}
class MainA{
    public static void main(String[] args){
         Bird o=new Bird();
         o.walk();
         o.fly();
         o.sing();
   }
}
//static polymorphism-overloading, dynamic polymorphism-overriding
class A{
    public void flower(){
        System.out.println("hi");
    }
    public void flower(int a, int b){    //method calling-actual
                                        //parameters-formal
        System.out.println(a+b);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        A a=new A();
        a.flower();
        a.flower(2, 3);
    }
    

    
}

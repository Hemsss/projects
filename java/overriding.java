class A{
    public void disp(){
        System.out.println("hi");
    }
}
class B extends A{
    public void disp(){
        System.out.println("hello");
    }
}


public class overriding {

    public static void main(String[] args) {
        B obj=new B();
        obj.disp();
        
    }
    
}

class A{
     public void flower(){
        System.out.println("flower");
    }
}
class B extends A{
     public void sunflower(){
        System.out.println("sunflower");
    }
}

public class single_inheritance extends A{
    public static void main(String[] args) {
        
      B obj=new B();
      obj.flower();
      obj.sunflower();
     single_inheritance a=new single_inheritance();
     a.flower();
          


    }
}
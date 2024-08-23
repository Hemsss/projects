class square{
    public int area(int a){
        int areaSquare;
        return areaSquare=a*a;
    

    }
    public float area(float r ){
        float areaCircle;
         return areaCircle=(22/7)*r*r;
                     //pi r sq
                                       //1/2 *bh
    }
    public double area(int b, int h){
        double areaTriangle;
        return areaTriangle=(1/2)*b*h;
        
}



}


public class shapes {
    public static void main(String[] args) {

          square s=new square();
         int square1= s.area(4);
          s.area(2);
          s.area(2, 3);
        
        
    }
    
}

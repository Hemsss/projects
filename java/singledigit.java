class singled{
    public static int single(int num){
          int sum=0;
          while(num>9){
            while(num>0){
                sum+=num%10;
                num/=10;

            }
            num=sum;
            
          }
          return num;
    }
}


public class singledigit{

    
    public static void main(String[] args) {
    
      singled obj=new singled();
      
      System.out.println();
     

    }
}
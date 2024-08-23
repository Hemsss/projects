public class josephus1 {
    
    public static void main(String[] args) {
        System.out.println(jos(5,2)+1);


    }


    static int jos(int n,int k){
        if(n==0)
         return 0;
       return((jos(n-1, k)+k))%n; 

    }
}

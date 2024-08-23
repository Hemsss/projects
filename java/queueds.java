//construct queue with 5 elements and display largest element . input taken from user
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueds {
    public static void main(String[] args) {
      Queue<Integer> q=new PriorityQueue<Integer>();
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int max=0;
      
      for(int i=0;i<x;i++){
        q.add(s.nextInt());
      }
      System.out.println(q);
for(int i:q){
    if(max<i){
        max=i;
    }
    
       
                
    
}
System.out.println(max);


        
    }
    
}

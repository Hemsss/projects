import java.util.*;
public class dsstack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       for(int i=0;i<x;i++){
        s.add(sc.nextInt());
       }
        System.out.println(s);
       // System.out.println(s.peek());
        Collections.sort(s);
        System.out.println(s);


    }
    
}

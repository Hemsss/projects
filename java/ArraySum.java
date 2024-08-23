import java.util.*;
public class ArraySum{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int arrlen=s.nextInt();
        int[]arr=new int[arrlen];
        for(int i=0;i<arr.length;i++){
              arr[i]=s.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
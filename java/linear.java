import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
           arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
int element=s.nextInt();
for(int i=0;i<arr.length;i++){
    if(element==arr[i]){
        System.out.println("Element found"+arr[i]);

}


}


        

    }
}

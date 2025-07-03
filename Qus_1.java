import java.util.Scanner;

public class Qus_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0 ; i <n ; i++){
            System.out.print("enter element of "+(i+1)+": ");
            arr[i]=sc.nextInt();
        } 
        System.out.print("even element of an array : ");
         for(int i = 0 ; i <n ; i++){
            
        if(arr[i]%2==0){
            System.out.print("  "+arr[i]);
            sum +=arr[i];
            }
         }
         System.out.println();
        System.out.println("sum of even number of an array "+sum);
    }
}
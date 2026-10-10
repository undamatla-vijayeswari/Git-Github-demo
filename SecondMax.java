import java.util.*;
import java.lang.Integer;

public class SecondMax{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = Integer.MIN_VALUE;
        int largest = 0 , second_lar = 0 ;

        for(int i  = 0;i< n;i++){
            a[i] = sc.nextInt();
            
        }
        for(int i = 0 ;i< n;i++){
            if(max < a[i]){ 
                max = a[i];
                
                second_lar = largest;
                largest = max;
            }
        }

        System.out.println(" Second Maximum element in the given array is: " + max);

    }
}
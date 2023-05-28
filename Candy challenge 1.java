import java.io.*;
import java.util.*;

public class Main {
    
    public static int getLargest(int[] a, int total){  
            int temp;  
            for (int i = 0; i < total; i++)   
                {  
                    for (int j = i + 1; j < total; j++)   
                        {  
                            if (a[i] > a[j])   
                            {  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                }  
            }  
        }  
       return a[total-1];  
}  
 
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0;i<n;i++) {
           arr[i] = scn.nextInt();
        }
        
        int[] tempArr = new int[n];
        for (int j=0;j<n;j++) {
            tempArr[j] = arr[j];
        }
        int largetsNum = getLargest(tempArr,n);
        int k = scn.nextInt();
        
        for (int j=0;j<n;j++) {
            int sum = arr[j] + k;
            if (sum == largetsNum) {
                System.out.print("true"+" ");
            } else if (sum > largetsNum) {
                 System.out.print("true"+" ");
            } else {
                 System.out.print("false"+" ");
            }
        }
    }
}

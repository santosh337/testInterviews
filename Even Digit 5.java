import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        int numCount = 0;
        
        for (int i = 0;i<n;i++) {
           arr[i] = scn.nextInt();
    }
    
    for (int j=0;j<n;j++) {
           int count = 0;
            int num = arr[j];
           while(num!=0) {
                num = num/10;
                count++;
           }
           if (count%2==0) {
               numCount++;
           }
        }
        System.out.println(numCount);
    }
}

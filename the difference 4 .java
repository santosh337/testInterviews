import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         
         int[] arr = new int[n];
         int sum = 0;
         for (int i=0;i<n;i++) {
             arr[i] = scn.nextInt();
             sum += arr[i];
         }
         int digitSum = 0;
         
         int[] digitCount = new int[n];
         for (int j=0;j<n;j++) {
             int count = 0;
             int digit = arr[j];
             while (digit > 0) {
                 digit = digit/10;
                 count++;
             }
             digitCount[j] = count;
         }
         
         for (int k=0;k<n;k++) {
             int count = digitCount[k];
             int rem = 0 ;
             int num = arr[k];
             if (count>1) {
                 while (num != 0) {
                     rem = num%10;
                 num = num/10;
                 digitSum += rem;
                 }
             } else {
                 digitSum += arr[k];
             }
         }
            
         int difference = sum - digitSum;
        
        if (difference == -difference) {
            System.out.println(difference);
        } else {
            System.out.println(difference);
        }
         
    }
}

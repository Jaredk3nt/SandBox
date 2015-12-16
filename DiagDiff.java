import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int total = len * len;
        int count = 1;
        int d1Sum = 0; 
        int d2Sum = 0;
        int d1Count = 1;
        int d2Count = len;
        boolean d1 = true;
        boolean d2 = true;
        
        for(int i = 0; i < total; i++){
            int temp = in.nextInt();
            if(count > len){
                count -= len;
                d1 = true;
                d2 = true;
            }
            if(count == d1Count && d1){
                d1Sum += temp;
                d1Count ++;
                d1 = false;
            }
            if(count == d2Count && d2){
                d2Sum += temp;
                d2Count--;
                d2 = false;
            }
            count++;
        }
       
        System.out.println(Math.abs(d1Sum - d2Sum));
    }
}
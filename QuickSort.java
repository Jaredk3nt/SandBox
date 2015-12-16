import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i < len; i++){
            l.add(in.nextInt());
        }
        ArrayList<Integer> fin = sort(l);
    }
    
    public static ArrayList<Integer> sort(ArrayList<Integer> l){
        if(l.size() <= 1){
            return l;
        }else{
            int p = l.get(0);
            int len = l.size();
            ArrayList<Integer> sm = new ArrayList<Integer>();
            ArrayList<Integer> bg = new ArrayList<Integer>();
            for(int i = 1; i < len; i++){
                int temp = l.get(i);
                if(temp >= p){
                    bg.add(temp);
                }else{
                    sm.add(temp);
                }
            }
            ArrayList<Integer> fin = new ArrayList<Integer>();
            ArrayList<Integer> ssm = sort(sm);
            ArrayList<Integer> sbg = sort(bg);
            fin.addAll(ssm); 
            fin.add(p);
            fin.addAll(sbg);
            printAL(fin);
            return fin;
        }
    }
    
    public static void printAL(ArrayList<Integer> l){
        int len = l.size();
        for(int i = 0; i < len; i++){
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
    }
}
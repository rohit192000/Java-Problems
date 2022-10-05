import java.util.* ;
import java.io.*; 
import java.util.Scanner;
import java.lang.Math.*;

class Solution {
    public static void main(String args[]) {
        CountPrime obj = new CountPrime();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        long st = System.currentTimeMillis();
        System.out.println(obj.totalPrime(s, e));
        long et = System.currentTimeMillis();
        System.out.println(et-st);
    }
}
class CountPrime {
    // Write your totalPrime function here
    int totalPrime(int a , int b){
        int count = 0;
        CountPrime cp = new CountPrime();
        for(int j = a;j<=b;j++){
            if(cp.isPrime(j)){
                count++;
            }
        }
        return count;
    }
    boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int j = 2; j<Math.floor(Math.sqrt(n))+1; j++){
            if(n%j == 0){
                return false;
            }
        }
        return true;
    }
}
        

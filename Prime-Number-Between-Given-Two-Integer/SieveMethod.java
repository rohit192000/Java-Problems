import java.io.*;
import java.util.*;
import java.lang.*;

class SieveMethod{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        SieveMethod sieve = new SieveMethod();
        System.out.println(sieve.sievePrime(s,e));
    }

    int sievePrime(int s, int t){
        String[] prime = new String[t];
        for(int i = 0; i<prime.length; i++){
            prime[i] = "True";
        }
        int p = 2;
        try{
            while(p*p <= t){
                if(prime[p] == "True"){
                    for(int i = p*p; i < prime.length; i+=p){
                        prime[i] = "False";
                    }
                }
                p++;
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }
        int count = 0;
        for(int i = 0; i<prime.length;i++){
            if((prime[i] == "True") && i>=2){
                count++;
            }
        }
        return count;
    }
}
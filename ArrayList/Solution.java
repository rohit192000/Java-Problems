import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int index = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i < l;++i){
            arr.add(scan.nextInt());
        }
        reverseArray(arr,index);
        for(int i = 0; i <= arr.size()-1; ++i){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void reverseArray(ArrayList<Integer> arr, int m){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i <= m; ++i){
            temp.add(arr.get(i));
        }
        for(int i = arr.size()-1; i > m; --i){
            temp.add(arr.get(i));
        }
        for(int i = 0; i < arr.size(); ++i){
            arr.set(i,temp.get(i));
        }
    }
}
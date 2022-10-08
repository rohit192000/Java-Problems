// Sort an array of integers containing only 0, 1 and 2.
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Sort012{
    public static void main(String[] args){
        /*
        Sample Input
        8
        1 0 0 1 2 2 1 0

        Sample Input
        0 0 0 1 1 1 2 2
        */
        Scanner scan = new Scanner (System.in);
        // length of an array
        int l = scan.nextInt();
        // array of length l
        int[] arr = new int[l];
        for(int i = 0; i<l;++i){
            arr[i] = scan.nextInt();
        }
        long st = System.currentTimeMillis();
        sort(arr);

        for(int i = 0; i<l; ++i){
            System.out.print(arr[i]+" ");
        }
        long et = System.currentTimeMillis();
        System.out.println(et-st);
    }

    public static void sort(int[] arr){
        // Creating an object of array list and assigning reference
        // of that object to temp variable
        ArrayList<Integer> temp = new ArrayList<Integer>();
        // loop to add values of array arr into ArrayList temp
        for(int i = 0;i<arr.length; ++i){
            temp.add(arr[i]);
        }
        // Sorting function to sort array
        
        // one method to sort ArrayList
        // temp.sort(Comparator.naturalOrder());


        // Another method to sort using Collections.
        Collections.sort(temp);

        // assigning sorted array list temp to array arr.
        for(int i = 0; i<arr.length; ++i){
            arr[i] = temp.get(i);
        }
    }
}
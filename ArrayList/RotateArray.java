import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
class RotateArray {
    
    public static void main(String args[]) {
        
        // Code to rotate the array by a given integer
        /*
        Sample input
        8
        1 2 3 4 5 6 7 8
        3

        Output
        4 5 6 7 8 1 2 3

        First line contains length of array
        Second line contains array
        Third linr contains integer by which we rotate the array
        */
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<l; i++){
            arr.add(scan.nextInt());
        }
        int k = scan.nextInt();
        rotateArray(arr,k);
        for(int i = 0; i<l; ++i){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void rotateArray(ArrayList<Integer> arr, int k){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = k; i < arr.size(); ++i){
            temp.add(arr.get(i));
        }
        for(int i = 0; i<k; ++i){
            temp.add(arr.get(i));
        }
        for(int i = 0; i<arr.size(); ++i){
            arr.set(i,temp.get(i));
        }
    }
}
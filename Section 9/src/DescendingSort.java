import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args){
        int[] arr = getArray(5);
        int[] sortedArray = getDescendingSortedArray(arr);
        printArray(sortedArray);
    }
    public static int[] getArray(int size){
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] getDescendingSortedArray(int[] arr){
        Arrays.sort(arr);
        int[] sortedArray = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1;i>=0;i--){
            sortedArray[index] = arr[i];
            index++;
        }
        return sortedArray;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
}

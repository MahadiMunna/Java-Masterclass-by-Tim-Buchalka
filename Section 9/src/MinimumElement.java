import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int size = readInteger();
        int[] arr = readElements(size);
        System.out.println(findMin(arr));
    }
    public static int readInteger(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static int[] readElements(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = readInteger();
        }
        return arr;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            min = ele < min ? ele : min;
        }
        return min;
    }

}

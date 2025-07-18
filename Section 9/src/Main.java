import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
//        myIntArray[4] = 50;
//        System.out.println(myIntArray[4]+" and length = "+myIntArray.length);
//
//        int[] newArray;
//        newArray = new int[] {1,2,3,4,5,6,7,8,9};
//        for (int i=0;i<newArray.length;i++){
//            System.out.println(newArray[i]);
//        }
//        for (int element : newArray){
//            System.out.print(element + " ");
//        }

        int[] firstArray = getRandomArray(10) ;
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        int[] largerArray = Arrays.copyOf(thirdArray, 15);

        System.out.println(Arrays.toString(smallerArray));
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "David")>=0){
            System.out.println("Found David!");
        }

        int[] s1 = {1,2,3,4,5,6};
        int[] s2 = {1,2,3,4,5,6};
        System.out.println(Arrays.equals(s1,s2)?"Equal":"Not Equal");
    }
    public static int[] getRandomArray(int len){
        Random random = new Random();
        int [] newInt = new int[len];
        for (int i=0;i<len;i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
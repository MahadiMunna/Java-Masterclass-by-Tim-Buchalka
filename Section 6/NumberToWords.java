public class NumberToWords{
    public static void main(String[] args){
        numberToWords(1003);
    }

    public static void numberToWords(int n){
        if (n<0){
            System.out.println("Invalid Value");
            return;
        }
        int reverseNum = reverse(n);
        int digitCount = getDigitCount(n);
        int revDigitCount = getDigitCount(reverseNum);
        do{
            int last = reverseNum%10;
            switch (last){
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverseNum/=10;
        }while(reverseNum!=0);
        if (digitCount!=revDigitCount){
            for(int i = revDigitCount;i<digitCount;i++){
                System.out.println("Zero");
            }
        }
        

    }
    public static int reverse(int n){
        int rev = 0;
        while(n!=0){
            int last = n%10;
            rev = rev*10+last;
            n/=10;
        }
        return rev;
    }
    public static int getDigitCount(int n){
        if (n<0){
            return -1;
        }
        int count = 0;
        do { 
            count++;
            n/=10;
        } while (n!=0);
        return count;
    }
}
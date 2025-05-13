public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(-1221));
    }
    // write code here
    public static boolean isPalindrome(int num){
        if (num<0){
            num = num*-1;
        }
        int reverse = 0;
        int temp = num;
        while(temp>0){
            int lastDigit = temp%10;
            temp/=10;
            reverse = reverse*10+lastDigit;
        }
        return num==reverse;
    }

}
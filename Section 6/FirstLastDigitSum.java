public class FirstLastDigitSum {
    // write code here
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int num){
        if (num<0) return -1;
        int sum = num%10;
        while(num!=0){
            int last = num%10;
            num/=10;
            if(num==0) sum+=last;
        }
        return sum;

    }
}
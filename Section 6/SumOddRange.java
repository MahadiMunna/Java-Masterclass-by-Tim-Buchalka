public class SumOddRange {
    public static void main(String[] args){
        System.out.println(sumOdd(2, 100)); 
    }
    // write code here
    public static boolean isOdd(int n){
        return n%2==1;
    }
    
    public static int sumOdd(int s,int e){
        if(s<=0 || e<=0 || e<s){
            return -1;
        }
        int sum = 0;
        for(int i=s;i<=e;i++){
            if (isOdd(i)){
                sum+=i;
                System.out.println(i);
            }
        }
        return sum;
    }
    
    
}
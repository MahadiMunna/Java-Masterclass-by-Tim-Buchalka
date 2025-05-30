public class GreatestCommonDivisor{
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(12,16));
        
    }
    public static int getGreatestCommonDivisor(int n1, int n2){
        if (n1<10 || n2<10) return -1;
        int min = n1>n2?n2:n1;
        for(int i=min;i>1;i--){
            if (n1%i==0 && n2%i==0) return i; 
        }
        return 1;
    }

}
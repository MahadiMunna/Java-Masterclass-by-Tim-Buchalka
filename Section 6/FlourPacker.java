public class FlourPacker{
    public static void main(String[] args){
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount<0||smallCount<0||goal<0) return false;
        for(int i=0;i<=bigCount;i++){
            for (int j=0;j<=smallCount;j++){
                if (i*5+j==goal) return true;
            }
        }
        return false;
    }
}
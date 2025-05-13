import java.util.Scanner;

public class ReadingUserInputChallenge{
    public static void main(String[] args){
        getSumOfIntegers();
        
    }

    public static void getSumOfIntegers(){
        int sum = 0;
        int counter = 5;
        System.out.println("Enter numbers: ");
        while (counter!=0){
            Scanner scanner = new Scanner(System.in);
            try {
                String num = scanner.nextLine();
                sum+= Integer.parseInt(num);
                counter--;
                
            } catch (NumberFormatException e) {
                System.out.println("Enter valid Integer");
            }
        }
        System.out.println("The sum is "+sum);
    }
}
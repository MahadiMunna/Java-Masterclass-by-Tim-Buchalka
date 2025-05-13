public class ParsingValues{
    public static void main(String[] args){
        String dateOfBirth = "1998";
        int currentYear = 2025;
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println(age);
        
    }
}
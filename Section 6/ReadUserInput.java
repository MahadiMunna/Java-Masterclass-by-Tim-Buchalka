public class ReadUserInput{
    public static void main(String[] args){
        System.out.println(getInputFromConsole(2025));
        
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.print("Hello "+name);
        String dateOfBirth = System.console().readLine(", What's your birth year? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are "+age+" years old.";
    }
}
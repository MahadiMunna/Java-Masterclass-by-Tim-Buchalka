public class EmbrachSwitchStatement{
    public static void main(String[] args){
        String dayOfWeek = printDayOfWeek(1);
        System.out.println("1 stands for "+dayOfWeek);
    }
    public static String printDayOfWeek(int day) {
        return switch (day){
            case 0 -> {yield "Friday";}//In {}block yield need to be used
            case 1 -> "Satureday";
            case 2 -> "Sunday";
            case 3 -> "Monday";
            case 4 -> "Tuesday";
            case 5 -> "Wednesday";
            case 6 -> "Trusday";
            default -> "Invalid day";
        };

        
    }
}
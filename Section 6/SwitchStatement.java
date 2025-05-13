// public class SwitchStatement{
//     public static void main(String[] args){
//         int swithchValue = 4;
//         switch (swithchValue){
//             case 1:
//                 System.out.println("It was 1");
//                 break;
//             case 2:
//                 System.out.println("It was 2");
//                 break;
//             case 3: case 4: case 5:
//                 System.out.println("It was "+swithchValue);
//                 break;
//             default:
//                 System.out.println("It was not in 1 to 5!");
//                 break;
//         }
//     }
// }



public class SwitchStatement{
    public static void main(String[] args){
        int swithchValue = 4;
        switch (swithchValue){
            case 1 -> System.out.println("It was 1");
            case 2 -> System.out.println("It was 2");
            case 3, 4, 5 -> System.out.println("It was "+swithchValue);
            default -> System.out.println("It was not in 1 to 5!");
        }
    }
}
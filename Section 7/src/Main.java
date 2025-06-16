public class Main {
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            LPAStudent s = new LPAStudent("S92300"+i,
//                    switch(i){
//                        case 1 -> "Mary";
//                        case 2 -> "Jane";
//                        case 3 -> "Tom";
//                        case 4 -> "Harry";
//                        case 5 -> "Gwen";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1999", "java Masterclass");
//            System.out.println(s);
//        }
//        Student pojoStudent = new Student("2314215", "Ann", "05/06/1995", "Java");
//        LPAStudent recordStudent = new LPAStudent("S984595","Bill", "04/05/1997", "Java");
//        System.out.println(pojoStudent);
//        System.out.println(recordStudent);
//        pojoStudent.setClassList(pojoStudent.getClassList()+" Masterclass");
//        System.out.println(pojoStudent.getName()+"is taking "+pojoStudent.getClassList());
//        System.out.println(recordStudent.name()+"is taking "+recordStudent.classList());
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }
}
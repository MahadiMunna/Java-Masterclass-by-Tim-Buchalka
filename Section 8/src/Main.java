public class Main {
    public static void main(String[] args) {
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//        Ceiling ceiling = new Ceiling(12, 55);
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//        Lamp lamp = new Lamp("Classic", false, 75);
//        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
//        bedRoom.makeBed();
//        bedRoom.getLamp().turnOn();
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}
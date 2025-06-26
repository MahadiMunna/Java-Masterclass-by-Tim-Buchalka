import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Munna");
        String name = (String) names.get(0);
        System.out.println(names.get(0));
        System.out.println(name);

//      casting arraylist as a specific type is generic
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Dhaka");
        String city = cities.get(0);

//      Autoboxing - Primitive to wrapper class
        int i = 2;
        Integer x = i;
        System.out.printf("%d %n", x);

//      unboxing - wrapper class to primitive
        Integer y = new Integer(20);
        int j = x;
        System.out.printf("%d\n", j);

        List<String> list = new ArrayList<>();
        list.add("Mahadi");
        list.add("Hasan");
        list.add("Munna");
        Iterator<String> iterator = list.iterator();
        String next = iterator.next();
        System.out.println(next);

        addToNames(names,"Mahadi");
        System.out.println(names);
        addIntToNames(names,100);
        System.out.println(names);

        List<String> namesList = new ArrayList<>();
        namesList.add("Mahadi");
        namesList.add("Munna");
        printList(namesList);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        printList(numbers);

        List<Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(10.122);
        doubleNumbers.add(20.22);
        printList(doubleNumbers);

        printNumbers(doubleNumbers);
        printNumbers(numbers);
    //  printNumbers(namesList);

//      Maps Demo
        Map<String, Date> m = new HashMap<>();

        List<Number> numbersList = new ArrayList<Number>();
        addToList(numbersList, 10);
    }

    // ? super lower bound wildcard which can write multiple types(Can write only
    private static void addToList(List<? super Number> numbers, Number i) {
        numbers.add(i);
    }


    // ? is wildcard here and it accepts any types
    private static void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    // ? extends upperbounds wildcard that accepts numbers only(Can read only)
    private static void printNumbers(List<? extends Number> numberList){
        numberList.forEach(System.out::println);
    }

    private static void addToNames(ArrayList names, String name) {
        names.add(name);
    }
    // When you pass an instance of array it doesn't check the type that's why int is adding
    private static void addIntToNames(ArrayList names, int num) {
        names.add(num);
    }
}
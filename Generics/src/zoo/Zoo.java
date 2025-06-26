package zoo;

public class Zoo {
    public static void main(String[] args) {
//        Cage<Monkey> cage = new Cage<Monkey>(new Monkey(), new Monkey());

//        Cage<Lion> cage1 = new Cage<Lion>();
//        cage1.setAnimal1(new Lion());
//
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();
        Cage.isCompatible(monkey1, monkey2);
    }
}

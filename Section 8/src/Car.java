public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public String startEngine(){
        String st = this.getClass().getSimpleName()+" -> startEngine()";
        return st;
    }

    public String accelerate(){
        String st = this.getClass().getSimpleName()+" -> accelerate()";
        return st;
    }

    public String brake(){
        String st = this.getClass().getSimpleName()+" -> brake()";
        return st;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}

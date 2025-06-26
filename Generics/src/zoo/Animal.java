package zoo;

public class Animal implements Eats, Runs{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }
}

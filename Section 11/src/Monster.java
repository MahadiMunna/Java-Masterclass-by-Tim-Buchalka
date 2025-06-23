import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
    public List<String> write() {
        List<String> newList = new ArrayList<>();
        newList.add(name);
        newList.add(String.valueOf(hitPoints));
        newList.add(String.valueOf(strength));
        return newList;
    }

    public void read(List<String> List) {
        if ( List != null && !List.isEmpty()) {
            this.name = List.get(0);
            this.hitPoints = Integer.parseInt(List.get(1));
            this.strength = Integer.parseInt(List.get(2));
        }
    }

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return className+"{" +
                "name='" + name +
                "', hitPoints=" + hitPoints +
                ", strength=" + strength +
                "}";
    }
}

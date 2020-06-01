import java.util.ArrayList;

public class Box <F extends Fruit> {
    private final ArrayList<F> fruits;
    private float totalWeight;

    public Box() {
        fruits = new ArrayList<>();
    }

    public Box(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    void add(F fruit){
        fruits.add(fruit);
    }

    void removeFruit(Box<F> box2){
        box2.fruits.addAll(fruits);
        fruits.clear();
    }

    float getTotalWeight() {
        if (fruits.size() != 0) {
            int i = 0;
            return fruits.size() * fruits.get(i).getWeight();
        } else {
            return totalWeight;
        }
    }

    boolean compare(Box<?> box2){
        return getTotalWeight() == box2.getTotalWeight();
    }
}

package Lesson1.Lesson1_1;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();

    public float getWeight(){
        float weight = 0.0f;

        for(T f : box){
            weight += f.getWeight();
        }return weight;
    }
    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }

    }
    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }
}





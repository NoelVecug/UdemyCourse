package Task_4;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(speed.equals("slow") ? getType() + "lazily swimming" : getType() + "darting frantically");
    }

    @Override
    public void makeNoise() {
        System.out.println(type.equals("Goldfish") ? getType() + "swish" : getType() + "splat");
    }
}

package Task_4;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(speed.equals("slow") ? type + " lazily swimming" : type + " darting frantically");
    }

    @Override
    public void makeNoise() {
        System.out.println(type == "Goldfish" ? type + " swish" : type + " splat");
    }
}

package Task_4;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(speed.equals("slow") ? type + " walking" : type + " running");
    }

    @Override
    public void makeNoise() {
        System.out.println(type == "Wolf" ? type + " howling" : type + " woofing");
    }
}

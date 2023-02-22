package Task_4;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getType() + "sheds hair all the time");
    }

    @Override
    public void move(String speed) {
        System.out.println(speed.equals("slow") ? getType() + "walking" : getType() + "running");
    }

    @Override
    public void makeNoise() {
        System.out.println(type.equals("Wolf") ? getType() + "howling" : getType() + "woofing");
    }
}

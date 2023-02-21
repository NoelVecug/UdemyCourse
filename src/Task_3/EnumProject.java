package Task_3;

import java.util.Random;

public class EnumProject {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal value = %d%n",
                    weekDay.name(), weekDay.ordinal() + 1);
        }
    }
    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}

package Task_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static HeavenlyBody temp;
    private static HeavenlyBody tempMoon;
    public static void main(String[] args) {
        addPlanet("Mercury", 88);

        addPlanet("Venus", 225);

        addPlanet("Earth", 365);
        addMoon("Moon", 27);

        addPlanet("Mars", 687);
        addMoon("Deimos", 1.3);
        addMoon("Phobos", 0.3);

        addPlanet("Jupiter", 4332);
        addMoon("Io", 1.8);
        addMoon("Europa", 3.5);
        addMoon("Ganymede", 7.1);
        addMoon("Callisto", 16.7);

        addPlanet("Saturn", 10759);

        addPlanet("Uranus", 30660);

        addPlanet("Neptune", 165);

        addPlanet("Pluto", 248);

        printPlanets();
        printSatellites("Jupiter");
        printAllMoons();
    }
    private static void addPlanet(String name, double orbitalPeriod) {
        temp = new HeavenlyBody(name, orbitalPeriod);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

    }
    private static void addMoon(String name, double orbitalPeriod) {
        tempMoon = new HeavenlyBody(name, orbitalPeriod);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
    }
    private static void printPlanets() {
        System.out.println("Planets:");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }
    }
    private static void printSatellites(String planetName) {
        HeavenlyBody satsOf = solarSystem.get(planetName);
        System.out.printf("Satellites of %s:\n", planetName);
        for (HeavenlyBody moons : satsOf.getSatellites()){
            System.out.println("\t" + moons.getName());
        }
    }
    private static void printAllMoons() {
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All satellites: ");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }
    }
}

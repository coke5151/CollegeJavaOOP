package Q4;

public class EnumTest {
    public static void main(String[] args) {
        System.out.printf("Light\tDuration%n%n");

        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s\t%d%n", light, light.getDuration());
        }
    }
}
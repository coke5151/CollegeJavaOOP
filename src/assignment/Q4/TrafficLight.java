package Q4;

public enum TrafficLight {
    // declare constants of enum type
    RED(50), // light is red for 50 seconds 
    GREEN(40), // light is green for 40 seconds
    YELLOW(5); // light is yellow for 5 seconds

    private final int duration;
    // enum type constructor
    TrafficLight(int durationSeconds) {
        duration = durationSeconds;
    }

    // accessor for duration
    public int getDuration() {
        return duration;
    }
}


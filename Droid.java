public class Droid {
    // Instance Variable
    int batteryLevel;

    // Create Droid Constructor.
    public Droid() {
        batteryLevel = 100;
    }

    public void activate() {
        System.out.println("Activated. How can I help you?");
        batteryLevel = batteryLevel - 5;
        // Update user on batteryLevel.
        System.out.println("Battery level is: " + batteryLevel + "percent.");
    }

    public int chargeBattery(int hours) {
        System.out.println("Droid charging...");
        batteryLevel = batteryLevel + hours;
        if (batteryLevel > 100) {
            batteryLevel = 100;
            System.out.println("Battery Level: " + batteryLevel + "percent.");
        } else {
            System.out.println("Battery Level: " + batteryLevel + "percent.");
        }
        return batteryLevel;
    }

    public int checkBatterLevel() {
        System.out.println("Battery Level: " + batteryLevel + "percent.");
        return batteryLevel;
    }

    public void hover(int feet) {
        if (feet > 2) {
            System.out.println("Error! I cannot hover above 2 feet");
        } else {
            System.out.println("Hovering...");
            batteryLevel = batteryLevel - 20;
            System.out.println("Battery Level: " + batteryLevel + "percent.");
        }
    }

    public static void main(String[] args) {
        Droid droid = new Droid();
        droid.activate();
        droid.chargeBattery(5);
        droid.hover(2);
    }

}

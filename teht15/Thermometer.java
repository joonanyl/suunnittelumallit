package factorymethod.teht15;

public class Thermometer implements CelciusMeter {
    private double temperature;

    public Thermometer(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}

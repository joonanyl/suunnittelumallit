package factorymethod.teht15;

public class UnitAdapter implements FahrenheitMeter {
    private CelciusMeter temperature;

    public UnitAdapter(CelciusMeter temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return convertToFahrenheit(temperature.getTemperature());
    }

    private double convertToFahrenheit(double temp) {
        return temp * 1.8 + 32;
    }
}

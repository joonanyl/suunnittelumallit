package factorymethod.teht15;

public class AdapterTest {
    public static void main(String[] args) {
        CelciusMeter celciusMeter = new Thermometer(11.5);
        System.out.println(celciusMeter.getTemperature() + "°C");

        FahrenheitMeter fahrenheitMeter = new UnitAdapter(celciusMeter);
        System.out.println(fahrenheitMeter.getTemperature() + "°F");
    }
}

package za.co.mie;

// Exercise 1.3
public class TemperatureConverter {
    float value;
    boolean is_celsius;

    public TemperatureConverter(float p_value, boolean p_is_celsius){
        value = p_value;
        is_celsius = p_is_celsius;
    }

    public float celsiusToFahrenheit(){
        return ((value * 9 / 5) + 32);
    }

    public float fahrenheitToCelsius(){
        return ((value - 32) * 5 / 9);
    }

    public float convert(){
        return is_celsius ? celsiusToFahrenheit() : fahrenheitToCelsius();
    }

    void displayConverted(){
        System.out.println(is_celsius ? ("Converted from " + value + " C to " + convert() + "F") : ("Converted from " + value + " F to " + convert() + "C"));
    }
}

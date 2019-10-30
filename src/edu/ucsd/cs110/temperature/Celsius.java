package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature temp = new Celsius(this.getValue());
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature temp = new Fahrenheit(this.getValue()*9/5+32);
        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(this.getValue()) + " C";
    }
}

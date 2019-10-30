package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature temp = new Fahrenheit( (this.getValue() -32) *5/9);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature temp = new Fahrenheit(this.getValue());
        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(this.getValue());
    }
}

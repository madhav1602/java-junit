public class TemperaturConverter {

    public static double CToF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double FToC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
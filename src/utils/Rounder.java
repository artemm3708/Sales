package utils;

public class Rounder {

    public static double moneyFormat(double value) {
        return (double)Math.round(value * 100d) / 100d;
    }
}

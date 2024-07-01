package util;

public class Calculator {
    public static double conversionToReais(double dollarPrice, double dollarQuantity) {
        return (dollarPrice * dollarQuantity) + (dollarPrice * dollarQuantity) * 0.06;
    }

}

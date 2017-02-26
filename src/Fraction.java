/**
 * Created by brian on 2017-02-24.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    // Default constructor
    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    // Constructor with specified numerator only
    Fraction(int n) {
        numerator = n;
        denominator = 1;
    }

    // Constructor with both numerator and denominator specified
    Fraction(int n, int d) {
        // If denominator is negative
        if (d < 0) {
            numerator = -1 * n;
            denominator = -1 * d;
        } else {
            numerator = n;
            denominator = d;
        }
    }


}

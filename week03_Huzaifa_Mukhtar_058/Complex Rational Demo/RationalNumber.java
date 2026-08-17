public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public RationalNumber(RationalNumber other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
        simplify();
    }

    public void simplify() {
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int common = gcd(numerator, denominator);
        numerator = numerator / common;
        denominator = denominator / common;
    }

    public RationalNumber add(RationalNumber other) {
        int num = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int den = this.denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber subtract(RationalNumber other) {
        int num = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int den = this.denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return numerator + "/" + denominator;
    }
}


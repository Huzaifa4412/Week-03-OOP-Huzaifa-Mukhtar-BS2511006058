public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber() {
        this(0, 1);
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
        this(other.numerator, other.denominator);
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a == 0 ? 1 : a;
    }

    public int getNumerator() { return numerator; }
    public int getDenominator() { return denominator; }

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
        int d = gcd(numerator, denominator);
        numerator /= d;
        denominator /= d;
    }

    public RationalNumber add(RationalNumber other) {
        return new RationalNumber(
            numerator * other.denominator + other.numerator * denominator,
            denominator * other.denominator
        );
    }

    public RationalNumber subtract(RationalNumber other) {
        return new RationalNumber(
            numerator * other.denominator - other.numerator * denominator,
            denominator * other.denominator
        );
    }

    @Override
    public String toString() {
        return denominator == 1 ? String.valueOf(numerator) : numerator + "/" + denominator;
    }
}

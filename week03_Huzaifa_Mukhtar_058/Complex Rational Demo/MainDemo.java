public class MainDemo {
    public static void main(String[] args) {
        System.out.println("Huzaifa Mukhtar - BS2511006058");
        System.out.println("Complex and Rational Number Demo\n");

        ComplexNumber a = new ComplexNumber(5, -2);
        ComplexNumber b = new ComplexNumber(-1, 4);
        ComplexNumber copy = new ComplexNumber(a);

        System.out.println("Complex numbers");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + a.add(b));
        System.out.println("a - b = " + a.subtract(b));
        System.out.println("a * b = " + a.multiply(b));
        System.out.println("copy = " + copy);

        RationalNumber r1 = new RationalNumber(8, 12);
        RationalNumber r2 = new RationalNumber(-3, 10);
        RationalNumber rCopy = new RationalNumber(r1);

        System.out.println("\nRational numbers");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r1 + r2 = " + r1.add(r2));
        System.out.println("r1 - r2 = " + r1.subtract(r2));
        System.out.println("copy = " + rCopy);

        try {
            new RationalNumber(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid denominator handled.");
        }
    }
}

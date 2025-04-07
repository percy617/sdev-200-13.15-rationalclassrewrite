import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(new BigInteger("1"), new BigInteger("2"));
        Rational r2 = new Rational(new BigInteger("1"), new BigInteger("3"));

        System.out.println("Rational 1: " + r1);
        System.out.println("Rational 2: " + r2);

        System.out.println("Addition: " + r1.add(r2));
        System.out.println("Subtraction: " + r1.subtract(r2));
        System.out.println("Multiplication: " + r1.multiply(r2));
        System.out.println("Division: " + r1.divide(r2));
    }
}
public class RationalDemo {
    public static void main(String[] args) {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 4);

        Rational addResult = r1.add(r2);
        System.out.println(addResult.toString());
        
        Rational subtractResult = r1.subtract(r2);
        System.out.println(subtractResult.toString());

        Rational multiplyResult = r1.multiply(r2);
        System.out.println(multiplyResult.toString());

        Rational divideResult = r1.divide(r2);
        System.out.println(divideResult.toString());
    }
}
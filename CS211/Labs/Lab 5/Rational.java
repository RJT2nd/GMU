/**
  * Name: Robert Thomas
  * netID: rthoma
  * Lab# 5 Section: 2H1
  * Date: 10/6/2017
  */

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int n, int d) {
        int gcd = gcd(Math.abs(n), Math.abs(d));

        this.numerator = n / gcd;
        this.denominator = Math.abs(d) / gcd;

        if(d < 0) {
            this.numerator = -this.numerator;
        }
    }

    private int gcd(int initialX, int initialY) {
        int x = initialX;
        int y = initialY;
        int r = x % y;
        while(r != 0){
            x = y;
            y = r;
            r = x % y;
        }
        return y;
    }

    public Rational add(Rational newRational) {
        int addedNumerator = (this.numerator * newRational.denominator) + (newRational.numerator * this.denominator);
        int addedDenominator = this.denominator * newRational.denominator;
        
        return new Rational(addedNumerator, addedDenominator);
    }

    public Rational subtract(Rational newRational) {
        int subNumerator = (this.numerator * newRational.denominator) - (newRational.numerator * this.denominator);
        int subDenominator = this.denominator * newRational.denominator;

        return new Rational(subNumerator, subDenominator);
    }

    public Rational multiply(Rational newRational) {
        int mulNumerator = this.numerator * newRational.numerator;
        int mulDenominator = this.denominator * newRational.denominator;

        return new Rational(mulNumerator, mulDenominator);
    }

    public Rational divide(Rational newRational) {
        int divNumerator = this.numerator * newRational.denominator;
        int divDenominator = this.denominator * newRational.numerator;

        return new Rational(divNumerator, divDenominator);
    }

    public String toString() {
        if(this.numerator % this.denominator == 0)
            return String.format("%d", this.numerator / this.denominator);
        else
            return String.format("%d/%d", this.numerator, this.denominator);
    }
}
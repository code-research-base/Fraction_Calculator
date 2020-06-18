package logic;

import design.exceptions.NoCommonDivisorsException;

import static logic.SimplificationMethods.getDivisors;
import static logic.SimplificationMethods.getCommonDivisors;

public class Fraction {
    protected double numerator;
    protected double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    private void setDenominator(double denominator) throws IllegalArgumentException {
        if (denominator != 0)
            this.denominator = denominator;
        else
            throw new IllegalArgumentException("Denominator can't be 0!");
    }

    public Fraction addition(Fraction fraction) {
        double numerator = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        double denominator = (this.denominator == fraction.denominator ?
                this.denominator : this.denominator * fraction.denominator);
        return new Fraction(numerator, denominator).getSimplified();
    }

    public Fraction subtraction(Fraction fraction) {
        double numerator = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
        double denominator = (this.denominator == fraction.denominator ?
                this.denominator : this.denominator * fraction.denominator);
        return new Fraction(numerator, denominator).getSimplified();
    }

    public Fraction product(Fraction fraction) {
        double numerator = this.numerator * fraction.numerator;
        double denominator = this.denominator * fraction.denominator;
        return new Fraction(numerator, denominator).getSimplified();
    }

    public Fraction division(Fraction fraction) {
        double numerator = this.numerator * fraction.denominator;
        double denominator = this.denominator * fraction.numerator;
        return new Fraction(numerator, denominator).getSimplified();
    }

    private Fraction getSimplified() {
        double[] commonDivisors = new double[0];
        try {
            commonDivisors = getCommonDivisors(getDivisors(numerator), getDivisors(denominator));
        } catch (NoCommonDivisorsException e) {
            return this;
        }

        for (double divisor : commonDivisors)
            while ((numerator % divisor == 0 && denominator % divisor == 0) && (numerator != 1 && denominator != 1)) {
                    numerator /= divisor;
                    denominator /= divisor;
            }
        return this;
    }

    public double getDecimal() {
        return numerator / denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }
}

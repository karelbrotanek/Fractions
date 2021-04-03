package cz.educanet;

import static cz.educanet.MathUtils.findGreatestCommonDenominator;
import static cz.educanet.MathUtils.findLowestCommonMultiple;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //region: basic operations (+, -, *, /)
    /**
     * Adds the fraction to the other fraction. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction plus(Fraction other) {
        int spolecnydelitel = findLowestCommonMultiple(this.denominator, other.denominator);// this je jmenovatel prvniho zlomku a other je jmenovatel druheho
        return new Fraction(this.numerator * spolecnydelitel / this.denominator + other.numerator * spolecnydelitel / other.denominator, spolecnydelitel);//scitani zlomku
        //throw new UnsupportedOperationException();
    }

    /**
     * Subtracts other from the fraction. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction minus(Fraction other) {
        int spolecnydelitel = findLowestCommonMultiple(this.denominator, other.denominator);// this je jmenovatel prvniho zlomku a other je jmenovatel druheho
        return new Fraction(this.numerator * spolecnydelitel / this.denominator - other.numerator * spolecnydelitel / other.denominator, spolecnydelitel);//scitani zlomku
        //throw new UnsupportedOperationException();
    }

    /**
     * Multiplies the two fractions. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction times(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);//nasobeni zlomku
        //throw new UnsupportedOperationException();
    }

    /**
     * Divides the two fractions (this / other). Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction dividedBy(Fraction other) {
        return this.times(other.getReciprocal());// prvni zlomek krat prevracena hodnota druheho
        //throw new UnsupportedOperationException();
    }
    //endregion

    //region: other operations
    /**
     * Gets the reciprocal (flipped) of the fraction. ie. reciprocal of 1/2 is 2/1
     * @return new fraction
     */
    public Fraction getReciprocal() {
        return new Fraction(this.denominator,this.numerator);
        //throw new UnsupportedOperationException();
    }

    /**
     * Simplifies the fraction
     * @return new fraction
     */
    public Fraction simplify() {
        int delitel = findGreatestCommonDenominator(this.denominator,this.numerator);//najde nejvetsi delitele
        return new Fraction(this.numerator/delitel, this.denominator/delitel);
        //throw new UnsupportedOperationException();
    }

    /**
     * Calculates the floating value of the fraction.
     * @return float
     */
    public float toFloat() {
        return (float) (this.numerator * 1.0 / this.denominator);// prevadi na float
        //throw new UnsupportedOperationException();
    }
    //endregion

    //region: getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //endregion
}

package rationalnumbers;

/**
 * An implementation of the RationalNumber interface for COSC3327 Challenge 01.
 * 
 * @author Daniel Porter
 */
public class RationalNumberImpl_Porter implements RationalNumber {

    // private data members to represent the rational number
    private int numerator;
    private int denominator;

    /**
     * Creates and simplifies a rational number.
     *
     * @param numerator - the top part of the rational number
     * @param denominator - the bottom part of the rational number
     */
    public RationalNumberImpl_Porter(int numerator, int denominator) {
    	if(denominator == 0) {
    		throw new RuntimeException("Denominator Cannot Be Zero");
    	}
    	
    	// simplify using the greatest common denominator
    	int gcd = greatestCommonDenominator(numerator, denominator);
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
        
        // if the fraction is negative if should be expressed using the numerator.
        if(this.denominator < 0) {
        	this.denominator *= -1;
        	this.numerator *= -1;
        }
     }

    /**
     * The top part of the rational number.
     * 
     * @return the numerator of the rational number
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * The bottom part of the rational number.
     * 
     * @return the denominator of the rational number
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Evaluates the rational number.
     * 
     * @return the rational number expressed as a floating point value
     */
    public double getValue() {
        return numerator/denominator;
    }
    
    /**
     * Uses Euclid's algorithm to find the greatest common denominator of the two numbers.
     * 
     * @param n1 - the first of two numbers
     * @param n2 - the second of the numbers
     * @return the greatest common denominator of the two numbers
     */
    private static int greatestCommonDenominator(int n1, int n2) {
    	return n2 == 0 ? n1 : greatestCommonDenominator(n2, n1%n2);
    }
    
    /**
     * @return the rational number as a string
     */
    public String toString() {
    	return "" + numerator + "/" + denominator;
    }
    
}

package rationalnumbers;

/**
 * A set of RationalNumber operation methods for COSC3327 Challenge 01.
 * 
 * @author Daniel Porter
 */
public class RationalNumberUtils_Porter {
	
	/**
	 * A test of equality between two RationalNumbers.
	 * 
	 * @param r1
	 * @param r2
	 * @return true if the RationalNumbers are equal, otherwise false
	 */
    public static boolean equal(RationalNumber r1, RationalNumber r2) {
        return r1.getNumerator() == r2.getNumerator() &&
	       r1.getDenominator() == r2.getDenominator();
    }

    /**
     * An addition operation.
     * 
     * @param r1
     * @param r2
     * @return the sum of r1 and r2 as a RationalNumber
     */
    public static RationalNumber add(RationalNumber r1, RationalNumber r2) {
        return new RationalNumberImpl_Porter(r1.getNumerator() * r2.getDenominator() +
                                             r2.getNumerator() * r1.getDenominator(),
                                             r1.getDenominator() * r2.getDenominator());
    }

    /**
     * A subtraction operation.
     * 
     * @param r1
     * @param r2
     * @return the difference between r1 and r2 as a RationalNumber
     */
    public static RationalNumber subtract(RationalNumber r1, RationalNumber r2) {
        return RationalNumberUtils_Porter.add(r1, RationalNumberUtils_Porter.negate(r2));
    }

    /**
     * A multiplication operation.
     * 
     * @param r1
     * @param r2
     * @return the product of r1 and r2 as a RationalNumber
     */
    public static RationalNumber multiply(RationalNumber r1, RationalNumber r2) {
        return new RationalNumberImpl_Porter(r1.getNumerator() * r2.getNumerator(),
                                             r1.getDenominator() * r2.getDenominator());
    }

    /**
     * A division operation.
     * 
     * @param r1
     * @param r2
     * @return the quotient of r1 and r2
     */
    public static RationalNumber divide(RationalNumber r1, RationalNumber r2) {
        return new RationalNumberImpl_Porter(r1.getNumerator() * r2.getDenominator(),
					     r1.getDenominator() * r2.getNumerator());
    }

    /**
     * A negation operation.
     * 
     * @param r1
     * @return a RationalNumber with the opposite sign
     */
    public static RationalNumber negate(RationalNumber r1) {
        return new RationalNumberImpl_Porter(r1.getNumerator() * -1, r1.getDenominator());
    }
    
}
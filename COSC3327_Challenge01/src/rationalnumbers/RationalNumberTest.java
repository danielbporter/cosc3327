package rationalnumbers;
import org.junit.Test;


public class RationalNumberTest {

	@Test
	public void test() {
		RationalNumber half = new RationalNumberImpl_Porter(1,2);
		assert(half.toString().equals("1/2"));
		RationalNumber negativePointTwo = new RationalNumberImpl_Porter(1,-5);
		assert(negativePointTwo.toString().equals("-1/5"));
		RationalNumber one = new RationalNumberImpl_Porter(7,7);
		assert(one.toString().equals("1/1"));
		RationalNumber zero = new RationalNumberImpl_Porter(0, 85);
		assert(zero.toString().equals("0/1"));
		RationalNumber fourThirds = new RationalNumberImpl_Porter(8,6);
		assert(fourThirds.toString().equals("4/3"));
		RationalNumber thirtyOneThirtySeconds = new RationalNumberImpl_Porter(62,64);
		assert(thirtyOneThirtySeconds.toString().equals("31/32"));
		
		assert(RationalNumberUtils_Porter.add(half, fourThirds).getValue() == 5/3);
		assert(RationalNumberUtils_Porter.subtract(one, thirtyOneThirtySeconds).getValue() == 1/32);
		assert(RationalNumberUtils_Porter.multiply(half, negativePointTwo).getValue() == -0.1);
		assert(RationalNumberUtils_Porter.divide(negativePointTwo, fourThirds).getValue() == -(1/5)/(4/3));
		assert(RationalNumberUtils_Porter.negate(one).getValue() == -1);
	}

}

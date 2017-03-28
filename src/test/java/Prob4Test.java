package com.prob4.product;

import junit.framework.TestCase;
import java.util.stream.*;

public class Prob4Test extends TestCase {
//	@Test
	public  void test() {
		double testX[]  = {500.0, 500.06350081938, 500.1290065658287, 500.1965221961687, 500.26605269984344, 500.33760309909695, 500.41117844915453, 500.4867838384047, 500.5644243885821, 500.6441052549521, 500.7258316264959, 500.80960872609757, 500.8954418107317, 500.9833361716528, 501.0732971345854, 501.16533005991573, 501.2594403428848, 501.3556334137821, 501.45391473814135, 501.55428981693706, 501.6567641867823, 501.76134342012824, 501.8680331254643, 501.9768389475203, 502.0877665674695, 502.20082170313293, 502.3160101091855, 502.4333375773631, 502.55280993667077, 502.67443305359296};
		double testY[]  = {3000.0, 3006.3816595476865, 3012.7766513722936, 3019.184995225193, 3025.6067108293846, 3032.0418178789478, 3038.49033603848, 3044.952284942539, 3051.427684195074, 3057.916553368858, 3064.4189120049105, 3070.934779611918, 3077.464175665651, 3084.007119608372, 3090.5636308482435, 3097.13372875873, 3103.7174326779914, 3110.3147619082774, 3116.925735715313, 3123.5503733276787, 3130.1886939361907, 3136.8407166932693, 3143.5064607123077, 3150.185945067032, 3156.87918879086, 3163.5862108762503, 3170.3070302740493, 3177.0416658928325, 3183.79013659824, 3190.552461212308};
		Prob4 test = new Prob4();

		test.something();
		Double ComputedX[] = test.getX();
		Double ComputedY[] = test.getY();
		double unboxedX[] = new double[31];
		double unboxedY[] = new double[31];
		int j;
		for(j = 1; j <= 31; j++){
			unboxedX[j-1] = ComputedX[j].doubleValue();
		}
		for(j = 1; j <= 31; j++){
			unboxedY[j-1] = ComputedY[j].doubleValue();
		}
//		double[] unboxedX = Stream.of(ComputedX).mapToDouble(Double::doubleValue).toArray();
		boolean correctValue = true;
//	ComputedX[1] = 1.00;
//		testX[1] = 1.00;
		int i;
		for(i = 0; i<=29; i++){
			if(unboxedX[i] != testX[i] || unboxedY[i] != testY[i]){ //|| ComputedY[i+1] != testY[i]){
				//System.out.print(ComputedX[i] + " == " + testX[i]);
				correctValue  = false;
			}

		}
	assertTrue(correctValue);
	}
}
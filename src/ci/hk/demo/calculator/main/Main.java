package ci.hk.demo.calculator.main;

import ci.hk.demo.calculator.impl.SimpleCalculator;
import ci.hk.demo.calculator.service.Calculator;

public class Main {
	
	public static void main(String ...args) {
		Calculator<Integer> calc1 = new SimpleCalculator();
		
		System.out.println("The average is : " + calc1.average(12, 23, 45));
	}

}

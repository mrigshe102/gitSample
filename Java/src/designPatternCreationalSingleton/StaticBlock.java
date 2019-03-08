package designPatternCreationalSingleton;

import javax.management.RuntimeErrorException;

public class StaticBlock {
	/*
	 * Declaring private and static instance of class which will be its only instantiation.
	 */
	private static StaticBlock inst;
	/*
	 * Creating private constructor will limit its instantiation from other classes. 
	 */
	private StaticBlock() {}
	static {
		try {
			inst = new StaticBlock();
		}catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Exception occurred");
		}
	}
	/*
	 * Static method that returns the instance of the class, this will be the only access point
	 * to the class object.
	 */
	public static StaticBlock getInstance() {
		return inst;
	}

}

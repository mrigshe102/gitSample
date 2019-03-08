package designPatternCreationalSingleton;

public class EagerSingleton {
	/*
	 * Declaring private and static instance of class which will be its only instantiation.
	 */
	private static final EagerSingleton inst = new EagerSingleton();
	/*
	 * Creating private constructor will limit its instantiation from other classes. 
	 */
	private EagerSingleton() {
	}
	/*
	 * Static method that returns the instance of the class, this will be the only access point
	 * to the class object.
	 */
	public static EagerSingleton getInstance() {
		return inst;
	}

}

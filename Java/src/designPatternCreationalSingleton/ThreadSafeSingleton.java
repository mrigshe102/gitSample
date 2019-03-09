package designPatternCreationalSingleton;
/**
 * @author      Mrigank Shekhar <mrigankshekhar@icloud.com>
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
public class ThreadSafeSingleton {
	/*
	 * Declaring private and static instance of class which will be its only instantiation.
	 */
	private static ThreadSafeSingleton inst;
	/*
	 * Creating private constructor will limit its instantiation from other classes. 
	 */
	private ThreadSafeSingleton() {
		
	}
	/*
	 * Static method that returns the instance of the class, this will be the only access point
	 * to the class object.
	 * 
	 * Below reduces the performance due to cost associated with synchronized method
	 */
	public static synchronized ThreadSafeSingleton getInstance() {
		if (inst == null) {
			inst = new ThreadSafeSingleton();
		}
		return inst;
	}
	/*
	 * Alternative way is 'Double check' locking implementation.
	 */
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (inst==null) {
			synchronized (ThreadSafeSingleton.class) {
				if (inst == null) {
					inst = new ThreadSafeSingleton();
				}
			}
		}
		return inst;
	}
}
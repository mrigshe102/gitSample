package designPatternCreationalSingleton;
/**
 * @author      Mrigank Shekhar <mrigankshekhar@icloud.com>
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
import com.sun.org.apache.xml.internal.security.keys.content.RetrievalMethod;

public class LazySingleton {
	/*
	 * Declaring private and static instance of class which will be its only instantiation.
	 */
	private static LazySingleton inst;
	/*
	 * Creating private constructor will limit its instantiation from other classes. 
	 */
	private LazySingleton() {
		
	}
	/*
	 * Static method that returns the instance of the class, this will be the only access point
	 * to the class object.
	 * 
	 * This can cause trouble in case of multi-threading system. In case multiple threads are inside the if loop 
	 * at the same time. It will destroy the singleton concept as both the threads will create different instances
	 * singleton class.
	 */
	public static LazySingleton getInstance() {
		if (inst == null) {
			inst = new LazySingleton();
		}
		return inst;
	}

}

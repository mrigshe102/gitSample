package designPatternCreationalSingleton;

import java.lang.reflect.Constructor;
/**
* @author      Mrigank Shekhar <mrigankshekhar@icloud.com>
* @version     1.0                 (current version number of program)
* @since       1.0          (the version of the package this class was first added to)
*/
public class ReflectionToDestroySingleton {
	public static void main(String[] args) {
		EagerSingleton inst1 = EagerSingleton.getInstance();
		EagerSingleton inst2 = null;
		EagerSingleton inst3 = null;
		try {
			Constructor[] constr = EagerSingleton.class.getDeclaredConstructors();
			for (Constructor cons : constr) {
				//Here Singleton will get destroyed
				cons.setAccessible(true);
				inst2 = (EagerSingleton) cons.newInstance();
				inst3 = (EagerSingleton) cons.newInstance();
				break;
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println(inst1.hashCode());
		System.out.println(inst2.hashCode());
		System.out.println(inst3.hashCode());
			}
		}
	

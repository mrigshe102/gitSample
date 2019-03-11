package designPatternCreationalSingleton;
/**
* @author      Mrigank Shekhar <mrigankshekhar@icloud.com>
* @version     1.0                 (current version number of program)
* @since       1.0          (the version of the package this class was first added to)
*/
public class BillPughSingleton {

		private BillPughSingleton() {}
		/*
		 * private inner static class contains the instance of Singleton Class. So, when 
		 * Singleton class is loaded the helper will not be loaded into Memory and only when
		 * specifically the getInstance() is called.
		 * 
		 * This doesn't require Synchronization which means a lot of performance improvement.
		 */
		private static class SingletonHelper {
			private static final BillPughSingleton inst = new BillPughSingleton();
		}
		public static BillPughSingleton getInstance() {
			return SingletonHelper.inst;
		}
}

package designPatternCreationalSingleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4866747232933846850L;
	
	private SerializedSingleton() {}
	
	private static class SingletonHelper{
		private static final SerializedSingleton instance = new
		SerializedSingleton();
		}
	public static SerializedSingleton getInstance(){
		return SingletonHelper.instance;
		}

}

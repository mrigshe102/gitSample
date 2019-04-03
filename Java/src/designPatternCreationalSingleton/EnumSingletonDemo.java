package designPatternCreationalSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonDemo {
	
	public static void main(String[] args) {
		EnumSingleton sing = EnumSingleton.Instance;
		
		System.out.println(sing.getValue());
		sing.setValue(2);
		System.out.println(sing.getValue());
		
	}
}

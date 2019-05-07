package designPatternCreationalFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleClass {

	//static boolean exists(int[] ints, int k) {

		/*
		 * Arrays.sort(ints); boolean result = false; int arr =
		 * Arrays.binarySearch(ints, k); //System.out.println(arr); if (arr>0) result =
		 * true; else if (arr<0) result = false;
		 * 
		 * return result;
		 * 
		 * 
		 * 
		 * List<Integer> arr = new List(arr.add(ints)); arr.addAll(ints);
		 * System.out.println(arr.indexOf(k));
		 * 
		 * return true;
		 */

//	}
	/*
	 * static boolean isFoo(String param) { if (param.equals("foo")) return true;
	 * 
	 * 
	 * }
	 */

	public static void main(String[] args) {
		
		  int[] ints = { -9, 14, 102, 37 };/* System.out.println(SampleClass.exists(ints,
		 * 102)); // true System.out.println(SampleClass.exists(ints, 36)); // false
		 */	
		int i =0;
		System.out.println(i++);
		
		Arrays.sort(ints);
		System.out.println(ints[3]);
		int k = ints.length;
		System.out.println(ints[k-1]);
		}
	

}

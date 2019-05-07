package whyNotJavaPrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaFunction {
	public static void main(String[] args) throws IOException {
		/*int[] sample = {5,6,7,8,9};
		Arrays.stream(sample).forEach(i -> System.out.println(i));
		
		for(int i =0; i<sample.length; i++) {
			System.out.println(sample[i]);
		}*/
		
		Stream<String> inventoryList = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		inventoryList
				.map(x -> x.split(","))
				.filter(distinctByKey(x -> x[0]))
				
			//	.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2] + " "+ x[3] + " " + x[4]+ " " + x[5]+ " " + x[6]+ " "));
						.collect(Collectors.toMap(
					            x -> x[0],
					            x -> Integer.parseInt(x[5])));
		inventoryList.close();
		for (String key : map.keySet()) {
			System.out.println(key + "  " + map.get(key));
		}
		
		
	}

	private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		 Set<Object> seen = ConcurrentHashMap.newKeySet();
		    return t -> seen.add(keyExtractor.apply(t));
	}

}

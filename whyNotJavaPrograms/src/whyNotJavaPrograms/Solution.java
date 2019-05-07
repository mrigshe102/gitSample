package whyNotJavaPrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
	
	public static void main(String[] args) throws IOException{
	
		RoomInventory room = new RoomInventory();
		List<RoomInventory> inventoryList = null;
		
		Stream<String> inventoryList1 = Files.lines(Paths.get("data.txt"));
		List<RoomInventory> result2 = Arrays.asList(room);
		Map<String, Set<RoomInventory>> mapByRoom = ((Collection<RoomInventory>) inventoryList1).stream().collect(Collectors.groupingBy(x -> room.getRoomCode(), Collectors.toSet()));
	//	result2 = inventoryList1.map(x -> x.split(",")).filter(distinctByKey(x -> x[0])).collect(Collectors.toList());
		//System.out.println(result2.get(0). .length);
		Set<RoomInventory> studentsInMyCountry = mapByRoom.get("Double");
	}
	
	private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		 Set<Object> seen = ConcurrentHashMap.newKeySet();
		    return t -> seen.add(keyExtractor.apply(t));
	}
}

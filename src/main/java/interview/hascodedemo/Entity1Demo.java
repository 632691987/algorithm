package interview.hascodedemo;

import java.util.HashMap;
import java.util.Map;

public class Entity1Demo {
	
	public static void main(String... args) {
		Entity1 entity1 = new Entity1("ABC", 11);
		Entity1 entity2 = new Entity1("ABC", 11);
		
		System.out.println("entity1.equals(entity2) = " + entity1.equals(entity2)); // true
		System.out.println("entity1 == entity2: " + (entity1 == entity2)); // true
		
		Map<Entity1, String> maps = new HashMap<>();
		maps.put(entity1, "value1");
		maps.put(entity2, "value2");
		
		System.out.println("maps.get(entity1) = " + maps.get(entity1)); // value2
		System.out.println("maps.get(entity2) = " + maps.get(entity2)); // value2
		
		// Map will mislead consider and override entity1 and entity2 is the same, and override
		
	}
	
}

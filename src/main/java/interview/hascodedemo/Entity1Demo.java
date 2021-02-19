package interview.hascodedemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class Entity1Demo {

	@Test
	public void test1() {
		Entity1 entity1 = new Entity1("ABC", 11);
		Entity1 entity2 = new Entity1("ABC", 11);
		
		System.out.println("entity1.equals(entity2) = " + entity1.equals(entity2)); // true
		System.out.println("entity1 == entity2: " + (entity1 == entity2)); // false

		System.out.println("entity1.equals(entity1) = " + entity1.equals(entity1)); // true
		System.out.println("entity1 == entity1: " + (entity1 == entity1)); // true
		System.out.println("entity1.hashCode " + entity1.hashCode()); // true
		System.out.println("entity2.hashCode " + entity2.hashCode()); // true

		Map<Entity1, String> maps = new HashMap<>();
		maps.put(entity1, "value1");
		maps.put(entity2, "value2");
		
		System.out.println("maps.get(entity1) = " + maps.get(entity1)); // value2
		System.out.println("maps.get(entity2) = " + maps.get(entity2)); // value2
		System.out.println("maps.size = " + maps.size()); // value2
		System.out.println("======================================================");
		System.out.println(entity1.toString());
		System.out.println(entity2.toString());
		System.out.println(maps.keySet().iterator().next().toString());
		System.out.println("======================================================");

		// Map will mislead consider and override entity1 and entity2 is the same, and override

		Map<String, Entity1> maps2 = new HashMap<>();
		maps2.put("key", entity1);
		maps2.put("key", entity2);

		System.out.println("maps2.get(key) = " + maps2.get("key")); // value2
		System.out.println("maps2.get(key) = " + maps2.get("key")); // value2
		System.out.println("maps2.size = " + maps2.size()); // value2
	}

	@Test
	public void test2() {
		Entity1 entity1 = new Entity1("ABC", 11);
		Entity1 entity2 = new Entity1("ABC", 11);
		Set<Entity1> entity1Set = new HashSet<>();
		entity1Set.add(entity1);
		entity1Set.add(entity2);

		System.out.println(entity1Set.size());
	}
	
}

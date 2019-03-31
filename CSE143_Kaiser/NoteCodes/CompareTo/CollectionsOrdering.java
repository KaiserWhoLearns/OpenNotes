import java.util.*;
public class CollectionsOrdering {
	public static void mian(String[] args) {
	testStringOrdering();	
	}
	public static void testStringOrdering() {
		List<String> tas = Arrays.asList(
				"erika", "sam", "kyle", "chin");
		System.out.println(tas);
		Collections.sort(tas);
		System.out.println(tas);
	}
	//When using the comparable interface, remember to implement Comparable<T>
		//<T> 'T' stands for the type
}

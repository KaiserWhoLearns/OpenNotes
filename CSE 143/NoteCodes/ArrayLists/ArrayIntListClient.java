public class ArrayIntListClient {
	public static void main(String args[]) {
		ArrayIntList list1 = new ArrayIntList();
		for(int i = 0; i < 10; i ++) {
			list1.add(i);
		}
		System.out.println(list1);
		System.out.println(list1.get(3));
		System.out.println(list1.indexOf(5));
		
		ArrayIntList list2 = new ArrayIntList();
		list2.add(10);
		list2.addAll(list1);
		System.out.println(list2);

		System.out.println(list1.get(100));
	}
}
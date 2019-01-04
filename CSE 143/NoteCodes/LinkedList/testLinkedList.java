public class testLinkedList {
	public static void main(String[] args) {
		LinkedIntList list = new LinkedIntList();
		System.out.println("Testing the first data with list = null, value = 5");
		list.addSorted(5);
		System.out.println("Your output is" + list);
		LinkedIntList list2 = new LinkedIntList();
		list2.add(2);
		list2.add(6);
		list2.add(8);
		System.out.println("Testing the second data with list = null, value = 5");
		list2.addSorted(5);
		System.out.println("Your output is" + list2);
	}
}
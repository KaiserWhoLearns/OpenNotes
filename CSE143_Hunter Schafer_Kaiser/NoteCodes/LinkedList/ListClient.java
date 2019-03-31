public class ListClient {
	public static void main(String[] args) {
		LinkedIntList list = new LinkedIntList();
		list.add(10);
		list.add(24);
		list.add(5);
		System.out.println(list);
		list.minToFront();
		System.out.println(list);
	}
}
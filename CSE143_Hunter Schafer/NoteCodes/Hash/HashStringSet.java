public class HashStringSet{
	private String[] elementData;
	private int size;
	private final int DEFAULT_CAPACITY = 10000;

	public HashStringSet() {
		elementData = new String[DEFAULT_CAPACITY];
		size = 0;
	}

	public void add(String value) {
		if(! contains(value)) {
			int index = Math.abs(value.hashCode()) % elementData.length;
			elementData[index] = value;
			size ++;
		}
	}

	public boolean contains(String value) {
		int index = Math.abs(value.hashCode()) % elementData.length;
		return elementData[index] == null;
	}
}
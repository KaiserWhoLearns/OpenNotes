public class ArrayIntList {
	private int[] elementData;
	private int size;

	public ArrayIntList() {
		elementData = new int[100];
		size = 0;
	}

	//add x to the end of the list
	public void add(int x) {
		elementData[size] = x;
		size++;
	}

	//add value to the index th of the list
	public void add(int index, int value) {
		for(int i = size-1; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = value;
		size++;
	}

	//pre: 0 <= index < size(), throws an IndexOutBoundsException
	//post: return the data in the index;
    public int get(int index) {
    	if (index < 0 || index >= size) {
    		throw new IndexOutOfBoundsException();
    	}
    	return elementData[index];
    }

    //return the index of the value; 
    //if there's not, return -1;
    public int indexOf(int value) {
    	for(int i = 0; i < size; i ++) {
    		if(elementData[i] == value)
    			return i;
    	}
    	return -1;
    }

    //remove the last element
    public void remove(int index) {
    	for(int i = index; i < size-1; i ++) {
    		elementData[i] = elementData[i+1];
    	}
    	size--;
    }

    //set the index th element as the value;
    public void set(int index, int value) {
    	elementData[index] = value;
    }

    //return the size of the list
    public int size() {
    	return size;
    }

    //clear all the elements in the list;
    public void clear() {
    	for(int i = 0; i < size; i ++) {
    		elementData[i] = 0;
    	}
    	size = 0;
    }

    //return the index of the last occurence of the given value in the list;
    //return -1 if not found
    public int lastIndexOf(int value) {
    	int result = -1;
    	for(int i = 0; i < size; i ++) {
    		if(elementData[i] == value)
    			result = i;
    	}
    	return result;
    }

    //returns true if the value is in the list
    public boolean contain(int value) {
    	for(int i = 0; i < size; i ++) {
    		if(elementData[i] == value)
    			return true;
    	}
    	return false;
    }

    //add other ArrayIntList to the end of the intList
    public void addAll(ArrayIntList other) {
    	for(int i = 0; i < other.size; i ++) {
    		add(other.elementData[i]);
    	}
    }

    public String toString() {
    	String result = "";
    	if(size == 0) {
    		result = "[]";
    	}
    	else{
    		result = "[" + elementData[0];
    		for(int i = 1; i < size; i ++) {
    			result += "," + elementData[i];
    		}
    		result += "]";
    	}
    	return result;
    }
}
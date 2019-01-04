public class commonCharsP {

public static void main(String[] args) {
	String s1 = "kaiserthegreat";
	String s2 = "ravenrthecutee";
	System.out.println(commonChars(s1,s2));
}


public static String commonChars(String s1, String s2) {
	if(s1.length() != s2.length()) {
		throw new IllegalArgumentException();
	}
	if(s1.length() == 1) {
		if(s1.charAt(0) != s2.charAt(0)) {
		    return ".";
	    } else {
		    return s1;
	    }
	} else {
		if(s1.charAt(0) != s2.charAt(0)) {
			//substring(n) take from n to the end
		    return "." + commonChars(s1.substring(1), s2.substring(1));
	    } else {
		    return s1.charAt(0) + commonChars(s1.substring(1), s2.substring(1));
	    }
    }
}

}
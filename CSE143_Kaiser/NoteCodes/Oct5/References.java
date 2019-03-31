import java.awt.*;

public class References {
	public static void main(String[] args) {
		int i = 4;
		int j = i;
		i = 7;
		//This time j is 4, i is 7;
		//Since they are primitive types;

		Point p = new Point(1, 2);
		Point q = p;    //refer q to p;
		p = new Point(3,4);
		// p is Point(3,4), q is Point(1,2), since it is newed;
	}
}
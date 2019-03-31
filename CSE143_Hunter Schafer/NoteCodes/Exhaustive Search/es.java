public class es {
	public static void main(String[] args) {
		/*System.out.println(weave(9,318));
		System.out.println(weave(394,128));*/
		callAll(1,1,0,0,"");
	}

	/*public static int weave(int a, int b) {
		if(a < 0 && b < 0) {
			throw new IllegalArgumentException();
		}
		if(a == 0 && b / 10 == 0) {
			System.out.println("a == 0:" + b);
			return b;
		}*/ /*else if(a == 0) {
			return 10*(b/10, a)
		} else {
			System.out.println(b);
			return b % 10 + 10 * weave(b/10, a);
		}
	}*/

	public static void travel(int x, int y, int a,int b, String direc, String path) {
		if(a == x && b == y) {
			System.out.println(path);
		} else if(a <= x && b <= y) {
			if(direc.equals("N")) {
				path += " " + direc;
				callAll(x, y, a, b + 1, path);
			}
			if(direc.equals("E")) {
				path += " " + direc;
				callAll(x, y, a + 1, b, path);
			}
			if(direc.equals("NE")) {
				path += " " + direc;
				callAll(x, y, a + 1, b + 1, path);
			}
		}
	}

	private static void callAll(int x, int y, int a, int b, String path) {
		travel(x,y,a,b,"N",path);
		travel(x,y,a,b,"E",path);
		travel(x,y,a,b,"NE",path);
	}
	
}

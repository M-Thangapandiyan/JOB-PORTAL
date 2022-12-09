package g;

public class e {

	public static void main(String[] args) {
	try {
		System.out.println("a");
		int a =99/0;
				System.out.println("b");
	}catch(Exception e) {
		System.out.println("c");
		System.exit(0);
	}finally {
		System.out.println("d");
	}

}

}

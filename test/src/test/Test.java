package test;

public class Test {
	public static void test(String s) {
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < i; j++) {
				if(c[i]==c[j]) {
					System.out.println(c[i]);
					return;
					
					///
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("asdfghjklopiuu");
	}

}

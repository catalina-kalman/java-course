
public class TypeCastingTest {

	public static void main(String[] args) {
//		double a = 130;
//		byte b = (byte) a;
//		System.out.println(b);
		
		int i = 0, j = 2;
        do {
            i = ++i;
            j--;
            System.out.println(j);
        } while (j > 0);
        System.out.println(i);
	}

}

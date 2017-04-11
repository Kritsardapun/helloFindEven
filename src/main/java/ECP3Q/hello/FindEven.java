package ECP3Q.hello;

public class FindEven {
	public void findEven(int[] e) {
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (e[i] % 2 == 0) {
				sum = sum + e[i];
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		FindEven f = new FindEven();
		int[] test = new int[4];
		test[0] = 1;
		test[1] = 6;
		test[2] = 3;
		test[3] = 4;
		f.findEven(test);
	}

}
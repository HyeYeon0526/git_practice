package git_practice3;

import java.util.Arrays;
import java.util.Random;

public class Main {

	static int[] creatArray(int size, int minValie, int maxValue) {
		Random random = new Random(); 
		int[] a = new int[size]; 
		for (int i = 0; i < a.length; ++i) 
			a[i] = random.nextInt(maxValue - minValue + 1) + 1; 
		return a;
	}
	
	
	public static void main(String[] args) {
		int[] a = creatArray(10, 1, 10);
		Sort.sort(a);
		System.out.println(Arrays.toString(a));
	}
}

package r2000.asia.tehran.p2052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			if (y == x) {
				if ((x & 1) == 0) {
					System.out.println(x << 1);
				} else {
					System.out.println(((x-1) << 1) + 1);
				}
			} else if (y + 2 == x) {
				if ((x & 1) == 0) {
					System.out.println((x-1) << 1);
				} else {
					System.out.println(((x-1) << 1) - 1);
				}
			} else {
				System.out.println("No Number");
			}
		}

	}

}

package r2010.me.arabcontest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			
			if (x == y && y == z && z == 0) {
				break;
			} else {
				if (x - y == y - z) {
					System.out.println("AP " + ((z << 1) - y));
				} else {
					System.out.println("GP " + z * (z / y));
				}
			}
		}
	}

}

package r2004.na.southcentral.p3077;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int t = 0; t < T; t++) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (x  >= y) {
				System.out.println("MMM BRAINS");
			} else {
				System.out.println("NO BRAINS");
			}
		}
	}

}

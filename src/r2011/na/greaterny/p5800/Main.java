package r2011.na.greaterny.p5800;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int t = 0; t < T; t++) {
			int c = in.nextInt();
			int r = in.nextInt();
			String s = in.nextLine().replaceAll("[^0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./:]", "");
			
			StringBuilder b = new StringBuilder();
			
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < r; j++) {
					b.append(s.charAt(i));
				}
			}
			
			System.out.println(c + " " + b.toString());
		}
		
	}

}

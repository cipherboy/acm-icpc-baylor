package r2010.na.greaterny.p4873;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int t = 0; t < T; t++) {
			int n = in.nextInt();
			in.nextLine();
			String l = in.nextLine().replaceAll(" \t\n", "");
			
			int[] c = new int[8];
			
			for (int i = 0; i < l.length() - 2; i++) {
				char d = l.charAt(i);
				char e = l.charAt(i+1);
				char f = l.charAt(i+2);
				
				if (f != 'T' && f != 'H') {
					break;
				} 
				
				int p = 0;
				if (d == 'H') {
					p = p | 4;
				}
				if (e == 'H') {
					p = p | 2;
				}
				if (f == 'H') {
					p = p | 1;
				}
				
				c[p] += 1;
			}
			
			System.out.println(n + " " + c[0] + " " + c[1] + " " + c[2] + " " + c[3] + " " + c[4] + " " + c[5] + " " + c[6] + " " + c[7]);
		}

	}

}

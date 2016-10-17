package r2013.na.northcentral.p6569;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		String l1 = in.nextLine();
		
		int cases = 1;
		
		while (!l1.equals("END")) {
			String l2 = in.nextLine();
			if (l1.length() != l2.length()) {
				System.out.println("Case " + cases + ": different");
			} else {
				int[] w1 = new int[26];
				int[] w2 = new int[26];
				
				for (int i = 0; i < l1.length(); i++) {
					w1[l1.charAt(i) - 'a'] += 1;
					w2[l2.charAt(i) - 'a'] += 1;
				}
				
				boolean diff = false;
				for (int i = 0; i < 26; i++) {
					if (w1[i] != w2[i]) {
						System.out.println("Case " + cases + ": different");
						diff = true;
						break;
					}
				}
				
				if (!diff) {
					System.out.println("Case " + cases + ": same");
				}
			}
			cases += 1;
			l1 = in.nextLine();
		}
	}
}

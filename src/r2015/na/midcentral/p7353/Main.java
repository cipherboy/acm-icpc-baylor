package r2015.na.midcentral.p7353;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()) {
			String[] line = in.nextLine().split(" ");
			
			
			int wp = 0;
			boolean valid = true;
			
			for (int i = 0; i < line[1].length(); i++) {
				char l = line[1].charAt(i);
				char p = line[0].charAt(wp);
				
				if (l == p) {
					wp += 1;
					if (wp == line[0].length()) {
						break;
					}
				} else {
					for (int w = wp+1; w < line[0].length(); w++) {
						char p2 = line[0].charAt(w);
						if (l == p2) {
							valid = false;
							break;
						}
					}
				}
			}
			
			if (!valid || wp != line[0].length()) {
				System.out.println("FAIL");
			} else {
				System.out.println("PASS");
			}
		}
	}

}

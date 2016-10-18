package uva.v112.p10878;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			if (line.contains(".")) {
				int result = 0;
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == ' ' || line.charAt(i) == 'o') {
						result = result << 1;
						if (line.charAt(i) == 'o') {
							result = result ^ 1;
						}
					}
				}
				
				System.out.print((char) result);
			}
		}
	}

}

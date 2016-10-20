package r2014.na.northcentral.p6865;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextInt()) {
			int cases = in.nextInt();
			int time = in.nextInt();
			
			int count = 0;
			
			boolean finished = false;
			
			for (int i = 0; i < cases; i++) {
				int c_time = in.nextInt();
				if (!finished && c_time <= time) {
					count += 1;
					time -= c_time;
				} else {
					finished = true;
				}
			}
			
			System.out.println(count);
			
		}

	}

}

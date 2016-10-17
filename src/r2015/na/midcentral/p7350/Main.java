package r2015.na.midcentral.p7350;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int[] wrong = new int[26];
			int[] times = new int[26];
			boolean[] solved = new boolean[26];
			
			String line = in.nextLine();
			while (!line.equals("-1")) {
				String[] parts = line.toLowerCase().split(" ");
				int time = Integer.parseInt(parts[0]);
				int problem = parts[1].charAt(0) - 'a';
				boolean right = false;
				
				if (parts[2].equals("right")) {
					right = true;
				}
				
				if (!right) {
					wrong[problem] += 1;
				} else {
					times[problem] = time;
					solved[problem] = true;
				}
				
				line = in.nextLine();
			}
			
			int tscore = 0;
			int tsolved  = 0;
			
			for (int i = 0; i < 26; i++) {
				if (solved[i]) {
					tsolved += 1;
					tscore += times[i] + 20*wrong[i];
				}
			}
			
			System.out.println(tsolved + " " + tscore);
		}
	}

}

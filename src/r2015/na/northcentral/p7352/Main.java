package r2015.na.northcentral.p7352;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static String[] r;
	public static int Same(String a, String b) {
		int i = 0;
		
		int p_a = 0;
		int p_b = 0;
		
		while (p_a < a.length() && p_b < b.length()) {
			if (a.charAt(p_a) == b.charAt(p_b)) {
				i += 1;
				p_a += 1;
				p_b += 1;
			}
			
			while (p_b < b.length() && p_a < a.length() && a.charAt(p_a) - 'A' < b.charAt(p_b) - 'A') {
				p_a += 1;
			}
			
			while (p_a < a.length() && p_b < b.length() && a.charAt(p_a) - 'A' > b.charAt(p_b) - 'A') {
				p_b += 1;
			}
		}
		
		return i;
	}
	
	public static int Recurse(boolean[] used, String last, int sum, int min) {
		if (sum > min) {
			//.out.println("Sum greater than min so returning" + min);
			return min;
		}
		
		int m_sum = 3628800;
		
		boolean found_free = false;
		
		for (int i = 0; i < r.length; i++) {
			if (!used[i]) {
				boolean[] c_u = Arrays.copyOf(used, used.length);
				c_u[i] = true;
				
				int s = Same(last, r[i]);
				int value = s + Recurse(c_u, r[i], sum + s, min);
				
				if (value < m_sum) {
					m_sum = value;
					//System.out.println("Replacing: " + (sum + value));
				}
				found_free = true;
			}
		}
		
		if (!found_free) {
			return 0;
		}
		
		return m_sum;
	}
	
	public static int Recurse() {
		int min = 3628800;
		
		for (int i = 0; i < r.length; i++) {
			boolean[] c_u = new boolean[r.length];
			c_u[i] = true;
			int value = Recurse(c_u, r[i], 0, min);
			//System.out.println("Total value" + value);
			
			if (value < min) {
				min = value;
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextInt()) {
			int routines = in.nextInt();
			r = new String[routines];
			
			in.nextLine();
			
			for (int i = 0; i < routines; i++) {
				r[i] = in.nextLine();
			} 
			
			System.out.println(Recurse());
		}
	}

}

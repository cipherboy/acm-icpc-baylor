package r2014.na.northcentral.p7089;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	// Not Solved
	
	public static class C {
		int id;
		int rank;
		
		public C(int id, int rank) {
			this.id = id;
			this.rank = rank;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = 1;
		
		while (in.hasNextInt()) {
			int arr = in.nextInt();
			C[] a = new C[arr];
			C[] b = new C[arr];
			
			for (int i = 0; i < arr; i++) {
				a[i] = new C(i+1, in.nextInt());
			}
			for (int i = 0; i < arr; i++) {
				b[i] = new C(i+1, in.nextInt());
			}
			
			Arrays.sort(a, new Comparator<C>() {
				@Override
				public int compare(C one, C two) {
					return two.rank - one.rank;
				}
			});
			Arrays.sort(b, new Comparator<C>() {
				@Override
				public int compare(C one, C two) {
					return two.rank - one.rank;
				}
			});
			
			boolean found = false;
			
			for (int i = 0; i < arr; i++) {
				if (b[i].id != a[i].id) {
					System.out.println("Case " + cases + ": " + (i+1));
					found = true;
					break;
				}
			}
			
			if (!found) {
				System.out.println("Case " + cases + ": agree");
			}
			
			cases += 1;
		}

	}

}

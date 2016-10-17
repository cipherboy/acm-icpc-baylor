package r2014.na.northcentral.p7087;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
		 
		 int cases = 1;
		 
		 while (in.hasNextLong()) {
			 long n = in.nextLong();
			 
			 long result = 1;
			 n -= 1;
			 
			 int p2 = 2;
			 int i = 2;
			 
			 while (n > 0) {
				 if (n > p2) {
					 result += p2*i;
					 n -= p2;
					 p2 *= 2;
					 i += 1; 
				 } else {
					 result += n*i;
					 n = 0;
					 break;
				 }
			 }
			 
			 System.out.println("Case " + cases + ": " + result);
			 
			 cases += 1;
		 }
		 
		 
		 
	}

}

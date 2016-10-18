package uva.v112.p11278;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < 256; i++) {
			map.put((char) i, (char) i);
		}
		
		map.put('4', 'q');
		map.put('5', 'j');
		map.put('6', 'l');
		map.put('7', 'm');
		map.put('8', 'f');
		map.put('9', 'p');
		map.put('0', '/');
		map.put('-', '[');
		map.put('=', ']');
		
		map.put('q', '4');
		map.put('w', '5');
		map.put('e', '6');
		map.put('r', '.');
		map.put('t', 'o');
		map.put('y', 'r');
		map.put('u', 's');
		map.put('i', 'u');
		map.put('o', 'y');
		map.put('p', 'b');
		map.put('[', ';');
		map.put(']', '=');
		
		map.put('a', '7');
		map.put('s', '8');
		map.put('d', '9');
		map.put('f', 'a');
		map.put('g', 'e');
		map.put('h', 'h');
		map.put('j', 't');
		map.put('k', 'd');
		map.put('l', 'c');
		map.put(';', 'k');
		map.put('\'', '-');
		
		map.put('z', '0');
		map.put('x', 'z');
		map.put('c', 'x');
		map.put('v', ',');
		map.put('b', 'i');
		map.put('n', 'n');
		map.put('m', 'w');
		map.put(',', 'v');
		map.put('.', 'g');
		map.put('/', '\'');
		
		
		map.put('$', 'Q');
		map.put('%', 'J');
		map.put('^', 'L');
		map.put('&', 'M');
		map.put('*', 'F');
		map.put('(', 'P');
		map.put(')', '?');
		map.put('_', '{');
		map.put('+', '}');
		
		map.put('Q', '$');
		map.put('W', '%');
		map.put('E', '^');
		map.put('R', '>');
		map.put('T', 'O');
		map.put('Y', 'R');
		map.put('U', 'S');
		map.put('I', 'U');
		map.put('O', 'Y');
		map.put('P', 'B');
		map.put('{', ':');
		map.put('}', '+');
		
		map.put('A', '&');
		map.put('S', '*');
		map.put('D', '(');
		map.put('F', 'A');
		map.put('G', 'E');
		map.put('H', 'H');
		map.put('J', 'T');
		map.put('K', 'D');
		map.put('L', 'C');
		map.put(':', 'K');
		map.put('"', '_');
		
		map.put('Z', ')');
		map.put('X', 'Z');
		map.put('C', 'X');
		map.put('V', '<');
		map.put('B', 'I');
		map.put('N', 'N');
		map.put('M', 'W');
		map.put('<', 'V');
		map.put('>', 'G');
		map.put('?', '"');
		
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			for (int i = 0; i < line.length(); i++) {
				System.out.print(map.get(line.charAt(i)));
			}
			System.out.print("\n");
		}
	}

}

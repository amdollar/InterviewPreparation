package io.test.Others;

import java.io.File;
import java.util.Scanner;

public class MirrorHouse {

	static void check() {
		if (width < minimumwidth || width > maximumwidth)
			System.out.println("Invalid width");
		if (length < minimumlength || length > maximumlength)
			System.out.println("Invalid length");

		boolean isEntrance = false;
		for (int x = 0; x < width; x++)
			for (int y = 0; y < length; y++) {
				if (x > 0 && x < width - 1 && y > 0 && y < length - 1) {
					// interior
					if ("./\\".indexOf(house[x][y]) == -1)
						System.out.println("invalid interior character");
				} else {
					// boundary
					if ("*x".indexOf(house[x][y]) == -1)
						System.out.println("invalid boundary character");
					if (house[x][y] == '*') {
						if (isEntrance) {
							System.out.println("Found multiple entrances");
						} else {
							isEntrance = true;
							if ((x == 0 && y == 0) || (x == 0 && y == length - 1) || (x == width - 1 && y == 0)
									|| (x == width - 1 && y == length - 1))
								System.out.println("Entrance in corner.");
						}
					}
				}
			}
	}

	final static int minimumwidth = 5;
	final static int maximumwidth = 20;
	final static int minimumlength = 5;
	final static int maximumlength = 20;

	static int width, length;
	static char house[][] = new char[maximumwidth][maximumlength];

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		int num = 1;
		while (true) {
			width = scanner.nextInt();
			if (width == 0)
				break;

			length = scanner.nextInt();

			int curX = 0, curY = 0;
			int dx = 0, dy = 0;

			for (int y = 0; y < length; y++) {
				String line = scanner.next();
				if (line.length() != width)
					System.out.println("Invalid length");
				for (int x = 0; x < width; x++) {
					house[x][y] = line.charAt(x);
					if (house[x][y] == '*') {
						curX = x;
						curY = y;
						if (x == 0)
							dx = 1;
						else if (x == width - 1)
							dx = -1;
						else if (y == 0)
							dy = 1;
						else if (y == length - 1)
							dy = -1;
					}
				}
			}
			check();

			do {
				curX += dx;
				curY += dy;
				if (house[curX][curY] == '/') {
					int temp = dx;
					dx = -dy;
					dy = -temp;
				} else if (house[curX][curY] == '\\') {
					int temp = dx;
					dx = dy;
					dy = temp;
				}
			} while (house[curX][curY] != 'x');
			house[curX][curY] = '&';

			System.out.println("HOUSE " + num++);
			for (int y = 0; y < length; y++) {
				for (int x = 0; x < width; x++)
					System.out.print(house[x][y]);
				System.out.println();
			}
		}
//closing the scanner 
		scanner.close();
	}

}
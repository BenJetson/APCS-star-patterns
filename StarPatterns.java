/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  Ben Godfrey
 * @version 16 JAN 2018
 */


class StarPatterns 
{
	public static void starGrid(int h, int w)
	{			
		for (int i=0; i<h; i++)
		{
			for (int j=0; j<w; j++)
			{				
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}	
	}
	
	public static void starBox(int h, int w)
	{
		for (int i=0; i<h; i++)
		{
			for (int j=0; j<w; j++)
			{	
			    if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
			    else System.out.print(" ");
				// System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}	
	}

	public static void starX(int h)
	{
		int w = h;

		for (int i=0; i<h; i++)
		{
			for (int j=0; j<w; j++)
			{
			    if (i==j || i+j==h-1) System.out.print("*");
			    else System.out.print(" ");
			    // System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}	
	}
	
	public static void starZ(int h)
	{
		int w = h;

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				if (i == 0 || i == h-1 || i + j == h - 1) System.out.print("*");
				else System.out.print(" ");
				// System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}

	public static void starXBox(int h) {
		int w = h;

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				if (i == 0 || i == h-1 || j == 0 || j == w-1 || i == j || i + j == h-1) System.out.print("*");
				else System.out.print(" ");
				// System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}

	public static void twoStarBoxes(int w) {
		int h = w;
		int x = w * 2;
		int y = x;
		
		for (int i=0; i<y; i++) {
			for (int j=0; j<x; j++) {
				if ( (i < y / 2 && j < x / 2) || (i >= y / 2 && j >= x / 2) ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				// System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}

	public static void starTriangle(int h) {

		for (int i=0; i<h; i++) {
			for (int j=0; j<h; j++) {
				if (j <= i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void emptyTriangle(int h) {

		for (int i=0; i<h; i++) {
			for (int j=0; j<h; j++) {
				if (j == 0 || j == i || i == h-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void starTriangleUR(int h) {
		int w = h;

		for (int i=0; i<h; i++) {
			for (int j=0; j<h; j++) {
				if (h-j <= h - i) System.out.print("*");
				else System.out.print(" ");
				// System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}
	
	public static void isocelesStarTriangle(int h) {
		int w = (h*2) - 1;
		
		for (int i=0; i<h; i++) {
			int z = ((i + 1) * 2) - 1;
			
			for (int j=0; j<w; j++) {
				if ((w / 2) - (z / 2) <= j && (w / 2) + (z / 2) >= j) System.out.print("*");
				else System.out.print(" ");
				// System.out.print(i + "" + j + " ");
			}
			// System.out.printf("| z: %d", z);
			System.out.println();
		}
	}

	public static void checkerBoard(int h) {
		int w = h;

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) System.out.print("*");
				else System.out.print(" ");
				// System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}

	public static void biggerCheckerBoard(int c, int s) {
		int x = c * s * 2;
		int y = x;

		for (int i=0; i<y; i++) {
			for (int j=0; j<x; j++) {
				if ((j / s % 2 == 0 && i / s % 2 == 0) || j / s % 2 != 0 && i / s % 2 != 0) System.out.print("*");
				else System.out.print(" ");
				// System.out.printf("%02d%02d ", i, j);
			}
			System.out.println();
		}
	}

	public static void upsideDownCheckeredTriangle(int h) {
		int w = (h*2) - 1;
		
		for (int i=h; i>0; i--) {
			int z = ((i + 1) * 2) - (h / 2) + 1;
			
			for (int j=0; j<w; j++) {
				if ((w / 2) - (z / 2) <= j
					&& (w / 2) + (z / 2) >= j 
					&& ((j % 2 == 0 && i % 2 == 0) 
					|| (j % 2 != 0 && i % 2 != 0))) System.out.print("*");
				else System.out.print(" ");
				// System.out.print(i + "" + j + " ");
			}
			// System.out.printf("| z: %d", z);
			System.out.println();
		}
	}
	
	// public static void starTHIS(int h) {
	// 	int w = h;

	// 	for (int i=0; i<h; i++) {
	// 		for (int j=0; j<w; j++) {
	// 			if () System.out.print("*");
	// 			else System.out.print(" ");
	//			System.out.print(i + "" + j + " ");
	// 		}
	// 		System.out.println();
	// 	}
	// }

	public static void main(String[] args) 
	{
		starGrid(5, 5);
		System.out.println();

		starBox(7, 9);
		System.out.println();
		
		starX(7);
		System.out.println();
		
		starZ(7);
		System.out.println();

		starXBox(8);
		System.out.println();

		twoStarBoxes(5);
		System.out.println();

		starTriangle(5);
		System.out.println();
		
		emptyTriangle(7);
		System.out.println();

		starTriangleUR(10);
		System.out.println();

		isocelesStarTriangle(5);
		System.out.println();
		
		checkerBoard(10);
		System.out.println();
		
		biggerCheckerBoard(4, 5);
		System.out.println();

		upsideDownCheckeredTriangle(10);
		System.out.println();
		
	}
     
}

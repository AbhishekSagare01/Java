package com.JavaCodePrac;

public class starpattern2 {

	public static void main(String[] args) {
		/*     *                        *
		      **   and pyramid         * *
		     ***                      * * *
		    ****                     * * * * 
		    
		    **/
		for (int i = 0; i <= 3; i++) {
			for (int j = 3; j >= i; j--) { // for spaces

				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) { // for stars
				// System.out.print("*");
				System.out.print(" *"); // if you just put space and then * it will print pyramid pattern
			}
			System.out.println();
		}

	}

}

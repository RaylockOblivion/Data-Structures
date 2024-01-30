package questions;

import java.util.Scanner;

/**
 * @author J M K Aditya
 */
public class Patterns {

	public static void main(String[] args) {
		// Use the appropriate method for the appropriate pattern
		//Scanner scanner = new Scanner(System.in);
		Patterns pattern = new Patterns();
		
		//Uncomment whichever statement you want to execute
		
		//pattern.PrintSolidRectangle(5, 3, '0','*');
		//pattern.PrintHollowRectangle(10, 3, '*');
		//pattern.PrintHalfPyramid(6, '*');
		//pattern.PrintInvertedHalfPyramid(6, '*');
		//pattern.PrintHollowInvertedHalfPyramid(6, '*');
		pattern.PrintFullPyramid(6, '*');
	}
	
	public void PrintSolidRectangle(int width, int height, char character, char border) {
		//print a solid rectangle of the given width and height with the given character and with the border
		/*****
		 ***** 
		 *****/
		boolean isBorderBlank = Character.isWhitespace(border);
		for(int h=0;h<height;h++) {
			for(int w=0;w<width;w++) {
				boolean isCurrentPosABorder = ( (w==0||h==0)  ||  (w==width-1||h==height-1) );
				if((!isBorderBlank) && isCurrentPosABorder) {
					System.out.print("" + border);
				}
				else {
					System.out.print(""+character);
				}
			}
			System.out.print("\n");
		}
	}
	
	public void PrintHollowRectangle(int width, int height, char border) {
		//print a hollow rectangle of the given width and height
		/*****
		 *   * 
		 *****/
		PrintSolidRectangle(width,height,' ', border);
	}
	
	public void PrintHalfPyramid(int size, char character) {
		//print a half pyramid with given size and character
		/*
		 **
		 ***  
		 ****/
		for(int h=0; h<size; h++) {
			for(int w=0; w<(h+1); w++) {
				System.out.print(""+character);
			}
			System.out.println("");
		}
	}
	
	public void PrintInvertedHalfPyramid(int size, char character) {
		//print a inverted half pyramid with given size and character
		/****
		 ***
		 **
		 */
		for(int h=size;h>0;h--) {
			for(int w=h;w>0;w--) {
				System.out.print(""+character);
			}
			System.out.println("");
		}
	}
	
	public void PrintHollowInvertedHalfPyramid(int size, char border) {
		//print a inverted half pyramid with given size and character
		/*****
		 *  *
		 * *
		 **
		 */
		for(int h=size;h>0;h--) {
			for(int w=h;w>0;w--) {
				if(h==size||w==h||w==1) {
					System.out.print(""+border);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public void PrintFullPyramid(int base, char character) {
		//print a full pyramid
		/*
		 *     *
		 *    * *
		 *   * * *
		 *  * * * *
		 */
		for(int h=0;h<base;h++) {
			for(int w=0;w<base;w++) {
				System.out.print(""+character);
			}
			System.out.println("");
		}
		
	}

}

package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		// Single dimensional array

		// declaration, instantiation,initialization
		
		int[] myNum = {10,20,30};
		String[] myStr = {"10","20","30"};
		char[] batch = {'A','B'};
		boolean[] status = {true,false};
		
		
		
		// declaration, instantiation
		
		int[] myNum1 = new int[3];
		String[] myStr1 = new String[3];
		char[] batch1 = new char[2]; 
		boolean[] status1 = new boolean[2];
		
		//initialization
		
		myNum1[0] = 10;
		myNum1[1] = 20;
		myNum1[2] = 30;
		
		System.out.println("Single dimensional array");
		System.out.println("===========================");

		// size of array
		
		int size = myNum1.length;
		System.out.println("Array Size:"+size);
		
		// element of array
		
		System.out.println("Array element at Index 1:"+myNum1[1]);
		
		// Print the array
		
		System.out.println("Array elements:");
		for (int i=0;i<size;i++)
		{
			System.out.println(myNum1[i]);
		}
		
			
		// Multi-dimensional array
		
		int[][] multi1 = new int[3][3];
		int multi[][] = new int[3][3];
		
		multi[0][0] = 10;
		multi[0][1] = 12;
		multi[0][2] = 14;
		
		multi[1][0] = 16;
		multi[1][1] = 18;
		multi[1][2] = 20;
		
		multi[2][0] = 22;
		multi[2][1] = 24;
		multi[2][2] = 26;
		
		System.out.println("Multi dimensional array");
		System.out.println("===========================");

		// size of array
		
				int rows = multi.length;
				int coloumn = multi[0].length;
				System.out.println("Array Size:"+rows+" * "+coloumn);
				
				// element of array
				
				System.out.println("Array element at row 1 and coumn 2:"+multi[1][2]);
				
				// Print the array
				
				System.out.println("Array elements:");
				for (int i=0;i<rows;i++)
				{
					for (int j=0;j<coloumn;j++)
					{
					System.out.print(multi[i][j]+" ");
					}
					System.out.println();
				}
		
		
		// Object Array
				Object objarr[] = new Object[5];
				objarr[0] = 1;
				objarr[1] = "One";
				objarr[2] = 'A';
				objarr[3] = 12.05;
				objarr[4] = true;
				
				System.out.print("Object Array:");
				for (int i=0;i<objarr.length;i++)
				{
					System.out.print(objarr[i]+" ");
				}
				
				
		
	}

}

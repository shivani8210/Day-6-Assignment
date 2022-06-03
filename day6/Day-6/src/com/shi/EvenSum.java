package com.shi;

public class EvenSum {

	public static void main(String[] args) {
		
		int[][] matrix = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println(matrix[0][2]);
		
		for(int c=0; c<matrix.length; c++) {
			
			int a = 0;
			
			for(int r=0; r<matrix.length; r++) {
				
				if(matrix[r][c] % 2 == 0) {
					
					a += matrix[r][c];
					
				}
				
			}
			
			System.out.println(a);
			
		}

	}

}

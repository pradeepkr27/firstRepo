/*Given an array of integers, find the first missing positive integer
 *  in linear time and constant space. In other words, find the lowest
 *   positive integer that does not exist in the array. The array can 
 *   contain duplicates and negative numbers as well.

	For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 
{
	public static void main(String[] args) 
	{
		int n;
		int i;
		int r;
		int sum=0;
		int k;
		int l;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the total number of elements: ");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for( i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Your array: " + (Arrays.toString(arr)));
		
		Arrays.sort(arr);
		System.out.println("sorted array: " + (Arrays.toString(arr)));
		
		outer: for(i=0; i<n; i++)
		{
			k = arr[i];
			l = arr[i+1];	
				while (k != l-1)
					{
						System.out.println(l-1);
						break outer;
					}
		}
	}
}

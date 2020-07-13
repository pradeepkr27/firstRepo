/* Given an array of integers, return a new array such that each element at index i 
 * of the new array is the product of all the numbers in the original array except the one at i.

	For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
	If our input was [3, 2, 1], the expected output would be [2, 3, 6]. 
*/
import java.util.Arrays;
import java.util.Scanner;

public class Problem2
{
	public static void main(String args[])
	{
		int n,m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total number of elements: ");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		m = arr.length;
		int[] left = new int[m];
		int[] right = new int[m];
		
		left[0] = 1;
		for(int i=1; i<n; i++)
		{
			left[i] = arr[i-1]*left[i-1];
		}
		
		right[m-1] = 1;
		for(int j=m-2; j>=0; j--)
		{
			right[j] = arr[j+1]*right[j+1];
		}
		
		for(int i=0; i<m; i++)
		{
			arr[i] = left[i]*right[i];
		}
		System.out.println(Arrays.toString(arr));
	}
}

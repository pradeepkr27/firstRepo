import java.util.Scanner;

public class Problem1 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the total number of elements: ");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		int k;
		System.out.print("Enter the value of k: ");
		k = s.nextInt();
		
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] + arr[j] == k)
				{
					System.out.println("Pair found in index "+ i + " and " + j);
					System.out.println("i.e, " + arr[i] + "+" + arr[j] + "=" + k);
					return;
				}
			}
			
		}
	}

}

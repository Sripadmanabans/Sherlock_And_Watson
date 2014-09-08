package sherlock_and_watson;

import java.util.Scanner;

public class SherlockAndWatson 
{
	public static void print(int array[], int index[]) 
	{
		for(int i = 0; i < index.length; i++)
		{
			System.out.println(array[index[i]]);
		}
	}
	
	public static int gcd(int a, int b) 
	{
		if(b == 0)
		{
			return a;
		}
		else
		{
			return gcd(b, a % b);
		}
	}
	
	public static void rotateRight(int array[], int k, int index[]) 
	{
		int i, x = 0;
		int n = array.length;
		int temp[] = new int[k];
		for(i = n - k; i < n; i++)
		{
			temp[x] = array[i];
			x++;
		}
		int d = n - k - 1;
		for(i = n - 1; d > -1; i--)
		{
			int value = array[d];
			array[d] = array[i];
			array[i] = value;
			d--;
		}
		
		for(i = 0; i < temp.length; i++)
		{
			array[i] = temp[i];
		}
		
		print(array, index);
	}
	
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int k = sr.nextInt();
		int q = sr.nextInt();
		int index[] = new int[q];
		int array[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			array[i] = sr.nextInt();
		}
		for(int i = 0; i < q; i++)
		{
			index[i] = sr.nextInt();
		}
		sr.close();
		while(k > n)
		{
			k = k - n;
		}
		if(k == n)
		{
			print(array, index);
		}
		else
		{
			rotateRight(array, k, index);
		}
	}
}

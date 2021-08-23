package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class ZeroSum {

	public static void main(String[] args)
	{
		System.out.print("Enter the value of N: ");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("Enter the "+N+" integers");
		int ar[]=new int[N];
		int noOfTriplets=0;
		for(int index=0;index<N;index++)
		{
			ar[index]=sc.nextInt();
		}
		for(int index1=0;index1<N;index1++)
		{
			for(int index2=index1+1;index2<N;index2++)
			{
				for(int index3=index2+1;index3<N;index3++)
				{
					int sum=ar[index1]+ar[index2]+ar[index3];
					if(sum==0)
					{
						noOfTriplets++;
					}
				}
				
			}
		}
		System.out.println("Number of Distinct triplets: "+noOfTriplets);
		sc.close();
	}

}

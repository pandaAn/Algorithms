package com.panda;

import com.panda.util.*;
public class InsertSort2 {
	
	public static void main(String[] args)
	{
		
		Integer[] a = SortHelper.generateRandomArray(1000, 1, 10000);
		
		sort(a);
		show(a);
	}

	public static void sort(Comparable[] a)
	{
	
		int N = a.length;
		for(int i = 0; i < N-1; i ++ ){
			for(int j = i + 1;j > 0 && less(a[j], a[j - 1]); j--)
			{
				exch(a, j, j - 1);
			}
		}
	
	}
	
	public static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a, int i, int j)
	{
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void show(Comparable[] a)
	{
		for(int i = 0;i < a.length;i ++)
		{
			System.out.println(a[i] + "");
		}
		
		System.out.println();
	}
	
	public static boolean isSorted(Comparable[] a)
	{
		for(int i = 0; i< a.length ; i ++)
		{
			if(less(a[i], a[i - 1])) return false;
		}
		return true;
	}
	
}

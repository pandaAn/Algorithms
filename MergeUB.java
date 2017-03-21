package com.panda;

import com.panda.util.*;

public class MergeUB {
	
	public static void main(String[] args)
	{
		
		Comparable[] a = SortHelper.generateRandomArray(1000, 1, 1200);

		sort(a, 0, a.length - 1);
		show(a);
	}
	
	public static void merge(Comparable[] a, int lo, int mid, int hi)
	{
		
		int len = hi - lo + 1;
		int auxLo = 0;
		int auxMid = mid - lo;
		int auxHi = hi - lo;
		
		Comparable[] aux = new Comparable[len];
		
		System.arraycopy(a, lo, aux, 0, len);
		
		int m = auxLo, n = auxMid + 1;
		
		for(int k = lo; k <= hi ;k ++)
		{
			 if      ( m > auxMid ) 		  a[k] = aux[n ++];
			 else if ( n > auxHi ) 			  a[k] = aux[m ++];
			 else if ( less(aux[n], aux[m]) ) a[k] = aux[n ++];
			 else 							  a[k] = aux[m ++];
		}
		
		
	}
	
	
	public static void sort(Comparable[] a, int lo, int hi)
	{
		if(lo >= hi) return;
		
		int mid = lo + (hi - lo) / 2;
		
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		merge(a, lo, mid, hi);
		
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

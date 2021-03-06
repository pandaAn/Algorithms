package com.panda;

import com.panda.util.*;
public class InsertSort1 {
	
	public static void main(String[] args)
	{
		
		Integer[] a = SortHelper.generateRandomArray(10, 1, 101);
		
		sort(a);
		show(a);
	}

	public static void sort(Comparable[] a)
	{
	
		int N = a.length;
    
//    Insertion1.java
//		for(int i = 0; i < N-1; i ++ ){
//			for(int j = i + 1;j > 0 && less(a[j], a[j - 1]); j--)
//			{
//				exch(a, j, j - 1);
//			}
//		}
		
    //optimized	code for Insertion1.java
    for(int i = 0; i < N-1; i ++ ){

        int j;
        Comparable e = a[i + 1];
        for(j = i + 1;j > 0 && less(e, a[j - 1]); j--)
          a[j] = a[j - 1]; 
        a[j] = e;
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

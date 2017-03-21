package com.panda.util;

import java.util.*;

public class SortHelper {
	
	public static Integer[] generateRandomArray(int n, int rangeL, int rangeR)
	{
		HashSet<Integer> hs = new HashSet<Integer>();

		addElementToHashSet(n,n, rangeL, rangeR, hs);
		
		Iterator<Integer> iterator = hs.iterator();
		Integer[] arr = new Integer[n];
		for(int i = 0;i < n && iterator.hasNext();i ++){
			arr[i] = iterator.next();
		}
		return arr;
	}
	/*
	 * @param:total需要产生数据总个数
	 * @param:count每次循环仍然需要的数据个数
	 * */
	private static void addElementToHashSet(int total,int count, int min, int max, HashSet<Integer> hs) 
	{
		for(int i = 0; i < count; i ++)
			hs.add((int) (Math.random()*max + min));
		if(total - hs.size()>0)
			addElementToHashSet(total,total - hs.size(), min, max, hs);
	}
}

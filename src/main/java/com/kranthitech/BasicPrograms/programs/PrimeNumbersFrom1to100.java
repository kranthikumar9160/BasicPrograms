package com.kranthitech.BasicPrograms.programs;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersFrom1to100 {
	public static void main(String[] args) {
		int n=100;
		
		
		List list = new ArrayList();
		
		for(int i=1; i<=n; i++) {
			int count=0;
			
			for(int j=i; j>=1; j--) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				list.add(i);
			}
		}
		
		System.out.println(list);
		
	}
}

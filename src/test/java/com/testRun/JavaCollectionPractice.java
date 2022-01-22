package com.testRun;

import java.util.Arrays;

public class JavaCollectionPractice {

	//static int [] a = {2,2,3,3,4,5,6,6};
	
	public void getduplicate(int [] a) {
		
		for (int i=0; i< a.length; i++) {			
			//System.out.println("My Array Number is = " +a[i]);	
			for (int j= (i+1); j< a.length; j++) {
				
				if(a[i]==a[j] ) {
					
					System.out.println("My Doublicate valou is = " +a[i]);					
				}				
			} 						
		}	
	}	
	public static void main(String[] args) {	
		
		int [] a = {2,2,3,3,4,5,6,6};
		JavaCollectionPractice obj = new JavaCollectionPractice ();
		obj.getduplicate(a);
	}
}

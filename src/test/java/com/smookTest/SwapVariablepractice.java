package com.smookTest;

public class SwapVariablepractice {
	
	public void getSwap (int a, int b) {
		
		System.out.println("A valo Befor Swap = " + a );
		System.out.println("B valo Befor Swap = " + b );

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A valo After Swap = " + a );
		System.out.println("B valo After Swap = " +b );
	}
	public static void main(String[] args) {
		SwapVariablepractice obj = new SwapVariablepractice();
		obj.getSwap(10,20);
		
	}

}
 
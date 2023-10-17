package com.kn.NestedLoop;

public class NestedWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=5) {
			System.out.println("---> i = "+ i);
			i++;
			int j=1;
			while(j<=3) {
				System.out.println("j = "+j);
				j++;
			}
		}

	}

}

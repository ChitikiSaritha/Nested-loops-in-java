package com.kn.NestedLoop;

public class nestedDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		do {
			System.out.println("--> i =" +i);
			i++;
			int j=1;
			do {
				System.out.println("j = "+j);
				j++;
			}while(j<=3);
		}while(i<=5);
		
	 	

	}

}

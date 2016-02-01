package jp.ac.chibafjb.x15g022.kd153;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("半径r --> ");
		
		Float s1 = sin.nextFloat();
		sin.close();
		
		System.out.println("円周 =="+(Math.round(2 * 3.14 * s1*10)/10.0f));
		System.out.println("面積 =="+(Math.round(3.14 * s1 * s1*10)/10.0f));
	}

}
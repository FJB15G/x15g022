package jp.ac.chibafjb.x15g022.kd142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("整数aの入力  -->  ");
		int s1 = sin.nextInt();
		System.out.print("整数bの入力  -->  ");
		int s2 = sin.nextInt();
		sin.close();                         
		System.out.println(s1 + "+" + s2 + "=" +(s1+s2) );
		System.out.println(s1 + "-" + s2 + "=" +(s1-s2) );
		System.out.println(s1 + "*" + s2 + "=" +(s1*s2) );
		System.out.println(s1 + "/" + s2 + "=" +(s1/s2) );

	}

}

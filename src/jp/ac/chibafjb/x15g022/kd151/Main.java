package jp.ac.chibafjb.x15g022.kd151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("aの入力");
		System.out.println("bの入力");
		
		Float s1 = sin.nextFloat();
		Float s2 = sin.nextFloat();
		sin.close();
		
		System.out.println(s1 + "+" + s2 + "=" + (s1 + s2));
		System.out.println(s1 + "-" + s2 + "=" + (s1 - s2));
		System.out.println(s1 + "*" + s2 + "=" + (s1 * s2));
		System.out.println(s1 + "/" + s2 + "=" + (s1 / s2));

	}

}

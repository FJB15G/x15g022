package jp.ac.chibafjb.x15g022.kd151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("aの入力");
		String s1 = sin.next();
		System.out.println("bの入力");
		String s2 = sin.next();
		
		sin.close();
		float a = Float.parseFloat(s1)+Float.parseFloat(s2);
		System.out.println(s1 + "+" + s2 + "=" + a);
		float b = Float.parseFloat(s1)-Float.parseFloat(s2);
		System.out.println(s1 + "-" + s2 + "=" + a);
		float c = Float.parseFloat(s1)*Float.parseFloat(s2);
		System.out.println(s1 + "*" + s2 + "=" + a);
		float d = Float.parseFloat(s1)/Float.parseFloat(s2);
		System.out.println(s1 + "/" + s2 + "=" + a);

	}

}

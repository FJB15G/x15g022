package jp.ac.chibafjb.x15g022.kd141;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("整数を１つ入力してください。  -->");
		int num = sin.nextInt();
		sin.close();                          
		
		System.out.println("あなたの入力した数は"+num+"です。");
		

	}

}

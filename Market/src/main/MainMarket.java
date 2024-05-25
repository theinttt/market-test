package main;

import java.util.Scanner;

import language.Chinese;
import language.English;
import language.Japanese;
import language.Korean;
import language.Myanmar;
import language.Thai;

public class MainMarket {

	public static int language;
	
	public static Myanmar m = new Myanmar();
	English e = new English();
	Japanese j = new Japanese();
	Korean k = new Korean();
	Chinese c = new Chinese();
	Thai t = new Thai();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********************");
		System.out.println("Welcome to your market");
		System.out.println("**********************");
		showlanguage();
		System.out.println("Please choice the language do you want to use!");
		language = sc.nextInt();
		
		choicedLanguage();
	}
	
	static void showlanguage() {
		System.out.println("*****************");
		System.out.println("*  1. Myanmar   *");
		System.out.println("*  2. English   *");
		System.out.println("*  3. Japanese  *");
		System.out.println("*  4. Korean    *");
		System.out.println("*  5. Chinese   *");
		System.out.println("*  6. Thai      *");
		System.out.println("*****************");
	}
	
	static void choicedLanguage() {
		
		if (language == 1) {
			m.callmethod();
		}
	}
}

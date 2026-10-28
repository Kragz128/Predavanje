package main;
import java.util.Scanner;

public class Trougao {

	public static void main(String[] args) {
		int N;
		Scanner u = new Scanner(System.in);
		
		System.out.println("Unesite n: ");
		N = u.nextInt();
		
		while (N <=0) {
			System.out.println("Unesite N ponovo. N je manji od nule: ");
			N = u.nextInt();
		}
		u.close();
		
		for (int i = 1; i <= N; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();

	}

	}
}
